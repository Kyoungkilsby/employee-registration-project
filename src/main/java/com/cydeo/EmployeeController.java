package com.cydeo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/register")
    public String creatEmployee(){
        return "employee/employee-create";
    }
}
