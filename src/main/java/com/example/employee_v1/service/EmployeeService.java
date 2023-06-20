package com.example.employee_v1.service;

import com.example.employee_v1.DTO.EmployeeDTO;
import com.example.employee_v1.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public void add(EmployeeDTO employeeDTO) {



    }
}
