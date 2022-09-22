package com.notasintegracao.Notas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserGrade {
    private String courseid;
    @JsonProperty("courseidnumber")
    private String codpredio;
    private String userid;
    private String userfullname;

    @JsonProperty("useridnumber")
    private String ra;
    private List<GradeItem> gradeitems;

    public String getCourseid() {
        return courseid;
    }

    public String getCodpredio() {
        return codpredio;
    }

    public String getUserid() {
        return userid;
    }

    public String getUserfullname() {
        return userfullname;
    }

    public String getRa() {
        return ra;
    }

    public List<GradeItem> getGradeitems() {
        return gradeitems;
    }


}
