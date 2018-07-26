package com.example.repository;

import com.example.model.Classroom;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ClassroomRepository extends CrudRepository<Classroom, Long> {
//    Iterable<Classroom> findAllByClasses(Set<Class> classes);
//    Classroom findByClasses(Set<Class> classes);
}
