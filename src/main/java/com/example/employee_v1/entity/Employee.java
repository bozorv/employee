package com.example.employee_v1.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Data
public class Employee implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Column(unique = true,nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String password;
    @ManyToOne
    private Role role;
    @ManyToOne
    private Department departmentId;

    private Boolean cadreOn = false;

    private Boolean rectorOn = false;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return role.getPermissionSet();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return fullName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return cadreOn;
    }

    @Override
    public boolean isEnabled() {
        return rectorOn;
    }
}
