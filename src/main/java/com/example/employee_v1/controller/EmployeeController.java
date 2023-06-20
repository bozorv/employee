package com.example.employee_v1.controller;

import com.example.employee_v1.DTO.EmployeeDTO;
import com.example.employee_v1.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.employee_v1.Utils.Constants.BASE_PATH;

@Controller
@RequiredArgsConstructor
@RequestMapping(BASE_PATH+ EmployeeController.EMPLOYEE_PATH)
public class EmployeeController {
    public static final String EMPLOYEE_PATH ="/employee";
    public static final String EMPLOYEE_PATH_ADD ="/add";

    private final EmployeeService employeeService;

    @PostMapping(EMPLOYEE_PATH_ADD)
    public String addEmployee(@RequestBody EmployeeDTO employeeDTO){

        employeeService.add(employeeDTO);



        return "";
    }



}
