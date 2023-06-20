package com.example.employee_v1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleType roleType;
    @ElementCollection
    @CollectionTable(name = "role_permission",
            joinColumns = {
                @JoinColumn(name = "role_id")},
            uniqueConstraints = {
                    @UniqueConstraint(columnNames = {"role_id", "permission"})})
    @Column(name = "permission")
    private Set<String>permissionSet;

    public Role(String name, RoleType roleType, Set<String> permission) {
        this.name = name;
        this.roleType = roleType;
        this.permissionSet = permission;
    }
}