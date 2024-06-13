package com.tka.studcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tka.studcrud.entity.Student;

@Repository
public interface StudentRepositorys extends JpaRepository<Student, Long> {
}
