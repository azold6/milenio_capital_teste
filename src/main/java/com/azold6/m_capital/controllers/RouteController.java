package com.azold6.m_capital.controllers;

import com.azold6.m_capital.services.GraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/routes")
public class RouteController {

    private GraphService graphService;

    @Autowired
    public RouteController(GraphService graphService){
        this.graphService = graphService;
    }

    @GetMapping(value = {"/{graphId}/from/{source}/to/{target}?maxStops={maxStops}", "/{graphId}/from/{source}/to/{target}"})
    public ResponseEntity<String> findRoutesWithMaxStops(@PathVariable Integer graphId,
                                                         @PathVariable String source,
                                                         @PathVariable String target,
                                                         @RequestParam(required = false) Integer maxStops){

        return ResponseEntity.ok("Não fui capaz de concluir este endpoint.");
    }
}
