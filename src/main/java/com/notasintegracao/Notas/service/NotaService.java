package com.notasintegracao.Notas.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.notasintegracao.Notas.dto.GradeReportUserGetGradeItems;
import com.notasintegracao.Notas.interfaces.RetornaNotas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService {

    @Autowired
    private RetornaNotas retornaNotas;

    public GradeReportUserGetGradeItems listar(){

        return retornaNotas.listaNotas("45a95009ec46bd475a4f640d6133e415",
                "gradereport_user_get_grade_items",
                "json",
                "7333");
    }


}
