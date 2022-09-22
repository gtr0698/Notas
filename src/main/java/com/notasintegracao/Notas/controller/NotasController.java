package com.notasintegracao.Notas.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.notasintegracao.Notas.dto.Etapa;
import com.notasintegracao.Notas.dto.GradeReportUserGetGradeItems;
import com.notasintegracao.Notas.dto.UserGrade;
import com.notasintegracao.Notas.service.NotaService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/webservice")
public class NotasController {

    @Autowired
    private NotaService notaService;

    @GetMapping
    public String listarNotasAva() throws JsonProcessingException {
        GradeReportUserGetGradeItems gradeReportUserGetGradeItems = notaService.listar();

        List<UserGrade> userGradeList = gradeReportUserGetGradeItems.getUsergrades();

        if(userGradeList.isEmpty()){
            return "lista de alunos vazia";
        }

        String codpredio = userGradeList.get(0).getCodpredio();
        // passa pra sql pra retornar a lista de ra e idturmadisc no banco do rm


        return "";
    }
}
