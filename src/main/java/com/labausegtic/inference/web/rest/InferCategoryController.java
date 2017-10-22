package com.labausegtic.inference.web.rest;

import com.labausegtic.inference.service.InferCategoryService;
import com.labausegtic.inference.service.dto.InferenceParameterDTO;
import com.labausegtic.inference.service.dto.ResultInferenceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class InferCategoryController {

    private final com.labausegtic.inference.service.InferCategoryService inferCategoryService;

    @Autowired
    public InferCategoryController(InferCategoryService inferCategoryService) {
        this.inferCategoryService = inferCategoryService;
    }

    @RequestMapping(value = "/api/inference",
            method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ResultInferenceDTO inferCategory(@RequestBody InferenceParameterDTO inferenceParameterDTO) {

        return inferCategoryService.getCategory(inferenceParameterDTO);

    }

}
