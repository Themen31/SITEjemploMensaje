package com.upao.msmatriculas.domain.entities;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;
@Document(collection = "employee")
public class Employee {
    @Id
    private Long id;

    @Indexed(unique = true)
    @Field(value = "Emp_No")
    private String empNo;

    @Field(value = "Full_Name")
    private String fullName;

    @Field(value = "Hire_Date")
    private Date hireDate;
}
