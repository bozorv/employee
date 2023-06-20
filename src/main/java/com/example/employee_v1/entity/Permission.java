package com.example.employee_v1.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Permission implements GrantedAuthority {
     FACULTY_ADD,
     FACULTY_DELETE,
     FACULTY_UPDATE,
     DEPARTMENT_ADD,
     DEPARTMENT_DELETE,
     DEPARTMENT_UPDATE,

    ;

    @Override
    public String getAuthority() {
        return name();
    }
}
