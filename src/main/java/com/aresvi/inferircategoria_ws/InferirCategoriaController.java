package com.aresvi.inferircategoria_ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aresvi.inferircategoria_ws.facts.DTOInferirCategoria;
import com.aresvi.inferircategoria_ws.facts.DTOResultado;


@RestController
public class InferirCategoriaController {

    private static Logger log = LoggerFactory.getLogger(InferirCategoriaController.class);

    private final InferirCategoriaService InferirCategoriaService;

    @Autowired
    public InferirCategoriaController(InferirCategoriaService inferirCategoriaService) {
        this.InferirCategoriaService = inferirCategoriaService;
    }

    @RequestMapping(value = "/inferencia", 
            method = RequestMethod.GET, produces = "application/json")
    public DTOResultado getQuestions(
            @RequestParam(required = true) double porcentajeNoRequerido,
            @RequestParam(required = true) double porcentajeNivel5,
            @RequestParam(required = true) double porcentajeNivel4,
            @RequestParam(required = true) double porcentajeNivel3,
            @RequestParam(required = true) double porcentajeNivel2,
            @RequestParam(required = true) double porcentajeNivel1,
            @RequestParam(required = true) int nivelInformatizacion) {

    	DTOInferirCategoria dtoIC = new DTOInferirCategoria(porcentajeNoRequerido,porcentajeNivel5,porcentajeNivel4,porcentajeNivel3,porcentajeNivel2,porcentajeNivel1,nivelInformatizacion);

        log.debug("DTO recibido: " + dtoIC);
        
        DTOResultado dto = InferirCategoriaService.getDTOResultado(dtoIC);

        return dto;
    }

}
