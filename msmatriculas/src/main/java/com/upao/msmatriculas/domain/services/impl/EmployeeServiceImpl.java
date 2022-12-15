package com.upao.msmatriculas.domain.services.impl;

import com.upao.msmatriculas.domain.entities.Employee;
import com.upao.msmatriculas.domain.services.EmployeeService;
import com.upao.msmatriculas.infraestructure.repositories.implnosql.EmployeeNosqlRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeNosqlRepositoryImpl employeeNosqlRepository;

    @Override
    public boolean Registrar(Employee employee) {
        return employeeNosqlRepository.Registrar(employee);
    }
    @Override
    public List<Employee> ListarTodos() {
        return employeeNosqlRepository.ListarTodos();
    }
}
