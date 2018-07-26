package com.example.repository;

import com.example.model.Class;
import com.example.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface ClassRepository extends CrudRepository<Class, Long>{

//    Iterable<Class> findAllByStudents(Student student);

}
