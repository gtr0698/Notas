package com.notasintegracao.Notas.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.notasintegracao.Notas.dto.NotasDto;
import com.notasintegracao.Notas.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webservice")
public class NotasController {

    @Autowired
    private NotaService notaService;

    @GetMapping
    public NotasDto listarNotasAva() throws JsonProcessingException {
        String notas = notaService.listar();
        NotasDto notasDto = notaService.jsonToJava(notas);

        return notasDto;
    }
}
