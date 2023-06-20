package com.example.employee_v1.controller;

import com.example.employee_v1.DTO.AuthDTO;
import com.example.employee_v1.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.example.employee_v1.Utils.Constants.BASE_PATH;

@Controller
@RequestMapping(BASE_PATH + AuthController.AUTH_PATH)
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    public static final String AUTH_PATH = "/auth";
    public static final String AUTH_SIGN_IN = "/sign-in";

    public String authSignIn(@RequestBody AuthDTO authDTO) {

        authService.signIn(authDTO);


      return "";

    }


}
