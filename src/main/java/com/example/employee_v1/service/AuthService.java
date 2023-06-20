package com.example.employee_v1.service;

import com.example.employee_v1.DTO.AuthDTO;
import com.example.employee_v1.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final EmployeeRepository employeeRepository;

    public void signIn(AuthDTO authDTO) {
         


    }



}
