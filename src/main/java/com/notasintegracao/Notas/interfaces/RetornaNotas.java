package com.notasintegracao.Notas.interfaces;

import com.notasintegracao.Notas.dto.GradeReportUserGetGradeItems;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "webservice", url = "https://uec.mrooms.net/webservice/rest/server.php")
public interface RetornaNotas {

    @GetMapping()
    GradeReportUserGetGradeItems listaNotas(@RequestParam("wstoken") String wstoken,
                                            @RequestParam("wsfunction") String wsfunction,
                                            @RequestParam("moodlewsrestformat") String moodlewsrestformat,
                                            @RequestParam("courseid") String courseid);

}
