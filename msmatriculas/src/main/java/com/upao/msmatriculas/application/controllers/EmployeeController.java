package com.upao.msmatriculas.application.controllers;

import com.upao.msmatriculas.domain.entities.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
@RequestMapping(path = "/employee")
public interface EmployeeController {
    @GetMapping(produces = "application/json")
    List<Employee> ListarTodos();

    @PostMapping(produces = "application/json", consumes = "application/json")
    boolean Registrar(@RequestBody Employee employee);

}
