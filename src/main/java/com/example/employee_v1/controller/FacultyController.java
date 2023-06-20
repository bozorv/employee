package com.example.employee_v1.controller;

import com.example.employee_v1.DTO.FacultyDTO;
import com.example.employee_v1.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.employee_v1.Utils.Constants.BASE_PATH;

@Controller
@RequestMapping(BASE_PATH + FacultyController.FACULTY_PATH)
@RequiredArgsConstructor
public class FacultyController {
    public static final String FACULTY_PATH ="/faculty";
    public static final String FACULTY_PATH_ADD="/add";

    private final FacultyService facultyService;
    @PostMapping(FACULTY_PATH_ADD)
    @PreAuthorize("")
    public String facultyAdd(@RequestBody FacultyDTO facultyDTO){
        facultyService.addFaculty(facultyDTO);



        return "";
    }



}
