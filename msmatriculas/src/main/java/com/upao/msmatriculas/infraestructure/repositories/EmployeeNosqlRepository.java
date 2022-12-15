package com.upao.msmatriculas.infraestructure.repositories;

import com.upao.msmatriculas.domain.entities.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeNosqlRepository extends MongoRepository<Employee,Long> {
}
