package com.notasintegracao.Notas.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class NotasDto {

    private List<NotasDto> usergrades;
    private String courseid;
    private String courseidnumber;
    private String useridnumber;
    private String itemname;
    private String gradeformatted;
    private List<NotasDto> gradeitems;


    public NotasDto(List<NotasDto> usergrades, String courseid, String useridnumber, String itemname,
                    String gradeformatted, List<NotasDto> gradeitems, String courseidnumber) {
        this.usergrades = usergrades;
        this.courseid = courseid;
        this.useridnumber = useridnumber;
        this.itemname = itemname;
        this.gradeformatted = gradeformatted;
        this.courseidnumber = courseidnumber;
        this.gradeitems = gradeitems;
    }

    public List<NotasDto> getUsergrades() {
        return usergrades;
    }

    public String getCourseid() {
        return courseid;
    }

    public String getUseridnumber() {
        return useridnumber;
    }

    public String getItemname() {
        return itemname;
    }

    public String getGradeformatted() {
        return gradeformatted;
    }

    public String getCourseidnumber() {
        return courseidnumber;
    }

    public List<NotasDto> getGradeitems() {
        return gradeitems;
    }

    public NotasDto() {
        super();
    }
}
