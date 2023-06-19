package com.example.employee_v1.repository;

import com.example.employee_v1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Employee,Integer> {

    Optional<Employee> findByFullName(String username);
}
