package com.labausegtic.inference.service;

import com.labausegtic.inference.service.dto.RecommendationParameterNextLevelDTO;
import com.labausegtic.inference.service.dto.ResultRecommendationNextLevelDTO;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendationNextLevelService {

    private static Logger log = LoggerFactory.getLogger(RecommendationNextLevelService.class);

    private final KieContainer kieContainer;

    @Autowired
    public RecommendationNextLevelService(KieContainer kieContainer) {
        log.info("Initialising a new bus pass session.");
        this.kieContainer = kieContainer;
    }

    
    public ResultRecommendationNextLevelDTO getRecommendation(RecommendationParameterNextLevelDTO RecommendationParameterNextLevelDTO) {

        KieSession kieSession = kieContainer.newKieSession("RecommendationNextLevelSession");

        ResultRecommendationNextLevelDTO resultRecommendationNextLevelDTO = new ResultRecommendationNextLevelDTO();

        kieSession.insert(RecommendationParameterNextLevelDTO);

        kieSession.insert(resultRecommendationNextLevelDTO);

        kieSession.fireAllRules();

        kieSession.dispose();

        return resultRecommendationNextLevelDTO;

    }

}
