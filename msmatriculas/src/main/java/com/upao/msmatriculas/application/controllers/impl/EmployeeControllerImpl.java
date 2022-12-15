package com.upao.msmatriculas.application.controllers.impl;

import com.upao.msmatriculas.application.controllers.EmployeeController;
import com.upao.msmatriculas.domain.entities.Employee;
import com.upao.msmatriculas.domain.services.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
public class EmployeeControllerImpl implements EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @Override
    public List<Employee> ListarTodos() {
        return employeeService.ListarTodos();
    }

    @Override
    public boolean Registrar(Employee employee) {
        return employeeService.Registrar(employee);
    }

}
