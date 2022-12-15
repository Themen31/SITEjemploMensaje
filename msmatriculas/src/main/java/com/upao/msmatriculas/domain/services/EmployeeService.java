package com.upao.msmatriculas.domain.services;

import com.upao.msmatriculas.domain.entities.Employee;
import com.upao.msmatriculas.domain.entities.Mensaje;

import java.util.List;

public interface EmployeeService {
    List<Employee> ListarTodos();

    boolean Registrar(Employee employee);
}
