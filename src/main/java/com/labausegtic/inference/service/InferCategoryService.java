package com.labausegtic.inference.service;

import com.labausegtic.inference.service.dto.InferenceParameterDTO;
import com.labausegtic.inference.service.dto.ResultInferenceDTO;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InferCategoryService {

    private static Logger log = LoggerFactory.getLogger(InferCategoryService.class);

    private final KieContainer kieContainer;

    @Autowired
    public InferCategoryService(KieContainer kieContainer) {
        log.info("Initialising a new bus pass session.");
        this.kieContainer = kieContainer;
    }

    
    public ResultInferenceDTO getCategory(InferenceParameterDTO inferenceParameterDTO) {

        KieSession kieSession = kieContainer.newKieSession("InferCategorySession");

        ResultInferenceDTO resultInferenceDTO = new ResultInferenceDTO();

        kieSession.insert(inferenceParameterDTO);

        kieSession.insert(resultInferenceDTO);

        kieSession.fireAllRules();

        kieSession.dispose();

        return resultInferenceDTO;

    }

}
