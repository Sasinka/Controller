package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    @GetMapping("/form")
    public String sayHello(){
        return "form.html";
    }

    @GetMapping("/grades")
    public String getGrades(){
        return "grades.html"; //controller looks for resources/templates
    }
}
