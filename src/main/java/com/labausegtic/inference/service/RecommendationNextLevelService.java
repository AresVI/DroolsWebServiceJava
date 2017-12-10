package com.labausegtic.inference.service;

import com.labausegtic.inference.service.dto.RecommendationParameterDTO;
import com.labausegtic.inference.service.dto.ResultRecommendationNextLevelDTO;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecommendationNextLevelService {

    private static Logger log = LoggerFactory.getLogger(RecommendationNextLevelService.class);

    private final KieContainer kieContainer;

    @Autowired
    public RecommendationNextLevelService(KieContainer kieContainer) {
        log.info("Initialising a new bus pass session.");
        this.kieContainer = kieContainer;
    }

    
    public ResultRecommendationNextLevelDTO getRecommendation(RecommendationParameterDTO recommendationParameterDTO) {

        KieSession kieSession = kieContainer.newKieSession("RecommendationNextLevelSession");

        ResultRecommendationNextLevelDTO resultRecommendationNextLevelDTO = new ResultRecommendationNextLevelDTO();

        kieSession.insert(recommendationParameterDTO);

        kieSession.insert(resultRecommendationNextLevelDTO);

        kieSession.fireAllRules();

        kieSession.dispose();

        return resultRecommendationNextLevelDTO;

    }

}
