package com.example.repository;

import com.example.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
//    DepartmentRepository findByDepartmentName(String department_name);
}
