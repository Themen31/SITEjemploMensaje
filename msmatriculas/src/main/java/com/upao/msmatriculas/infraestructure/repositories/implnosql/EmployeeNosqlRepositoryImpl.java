package com.upao.msmatriculas.infraestructure.repositories.implnosql;

import com.upao.msmatriculas.domain.entities.Employee;
import com.upao.msmatriculas.domain.repositories.EmployeeRepository;
import com.upao.msmatriculas.infraestructure.repositories.EmployeeNosqlRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmployeeNosqlRepositoryImpl implements EmployeeRepository {

    EmployeeNosqlRepository employeeNosqlRepository;
    @Override
    public boolean Registrar(Employee employee) {
        return false;
    }

    @Override
    public List<Employee> ListarTodos() {
        return null;
    }
}
