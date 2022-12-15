package com.upao.msmatriculas.domain.repositories;

import com.upao.msmatriculas.domain.entities.Employee;
import com.upao.msmatriculas.domain.entities.Mensaje;

import java.util.List;

public interface EmployeeRepository {
    boolean Registrar(Employee employee);
    List<Employee> ListarTodos();

}
