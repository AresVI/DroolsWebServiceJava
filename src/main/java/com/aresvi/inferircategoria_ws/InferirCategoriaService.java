package com.aresvi.inferircategoria_ws;

//import java.util.ArrayList;
import java.util.Collection;
//import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
//import org.kie.api.runtime.ObjectFilter;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.aresvi.inferircategoria_ws.facts.DTOInferirCategoria;
import com.aresvi.inferircategoria_ws.facts.DTOResultado;


@Service
public class InferirCategoriaService {

    private static Logger log = LoggerFactory.getLogger(InferirCategoriaService.class);

    private final KieContainer kieContainer;

    @Autowired
    public InferirCategoriaService(KieContainer kieContainer) {
        log.info("Initialising a new bus pass session.");
        this.kieContainer = kieContainer;
    }

    
    public DTOResultado getDTOResultado(DTOInferirCategoria dtoIC) {
        KieSession kieSession = kieContainer.newKieSession("InferirCategoriaSession");
        DTOResultado dtoR = new DTOResultado();
        kieSession.insert(dtoIC);
        kieSession.insert(dtoR);
        kieSession.fireAllRules();

        kieSession.dispose();
        return dtoR;
    }
    
    /**
     * Search the {@link KieSession} for bus passes.
     */
   /* private DTOInferirCategoria findDTOInferirCategoria(KieSession kieSession) {
        
        // Find all BusPass facts and 1st generation child classes of BusPass.
        ObjectFilter dtoInferirCategoriaFilter = new ObjectFilter() {
            @Override
            public boolean accept(Object object) {
                if (DTOInferirCategoria.class.equals(object.getClass())) return true;
                if (DTOInferirCategoria.class.equals(object.getClass().getSuperclass())) return true;
                return false;
            }
        };

        // printFactsMessage(kieSession);
        
        List<DTOInferirCategoria> facts = new ArrayList<DTOInferirCategoria>();
        for (FactHandle handle : kieSession.getFactHandles(dtoInferirCategoriaFilter)) {
            facts.add((DTOInferirCategoria) kieSession.getObject(handle));
        }
        if (facts.size() == 0) {
            return null;
        }
        // Assumes that the rules will always be generating a single bus pass. 
        return facts.get(0);
    }*/
    
    /**
     * Print out details of all facts in working memory.
     * Handy for debugging.
     */
    @SuppressWarnings("unused")
    private void printFactsMessage(KieSession kieSession) {
        Collection<FactHandle> allHandles = kieSession.getFactHandles();
        
        String msg = "\nAll facts:\n";
        for (FactHandle handle : allHandles) {
            msg += "    " + kieSession.getObject(handle) + "\n";
        }
        System.out.println(msg);
    }

}
