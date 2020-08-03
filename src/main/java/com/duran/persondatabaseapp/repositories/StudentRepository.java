package com.duran.persondatabaseapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duran.persondatabaseapp.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
