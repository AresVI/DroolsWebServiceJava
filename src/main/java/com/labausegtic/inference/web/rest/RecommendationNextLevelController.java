package com.labausegtic.inference.web.rest;

import com.labausegtic.inference.service.RecommendationNextLevelService;
import com.labausegtic.inference.service.dto.RecommendationParameterDTO;
import com.labausegtic.inference.service.dto.ResultRecommendationNextLevelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RecommendationNextLevelController {

    private final RecommendationNextLevelService recommendationNextLevelService;

    @Autowired
    public RecommendationNextLevelController(RecommendationNextLevelService recommendationNextLevelService) {
        this.recommendationNextLevelService = recommendationNextLevelService;
    }

    @RequestMapping(value = "/api/next-level",
            method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ResultRecommendationNextLevelDTO inferCategory(@RequestBody RecommendationParameterDTO recommendationParameterDTO) {
        return recommendationNextLevelService.getRecommendation(recommendationParameterDTO);

    }

}
