package com.notasintegracao.Notas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class GradeReportUserGetGradeItems {

    private List<UserGrade> usergrades;

    public List<UserGrade> getUsergrades() {
        return usergrades;
    }
}
