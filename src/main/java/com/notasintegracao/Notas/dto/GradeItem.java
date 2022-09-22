package com.notasintegracao.Notas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GradeItem {
    private String itemtype;
    private String itemname;
    private String gradeformatted;

    public String getItemtype() {
        return itemtype;
    }

    public String getItemname() {
        return itemname;
    }

    public String getGradeformatted() {
        return gradeformatted;
    }

    public float getGradeformattedWithZero() {

        if (gradeformatted.equals("-")) {
            return 0;
        }
        return Float.parseFloat(gradeformatted);
    }
}
