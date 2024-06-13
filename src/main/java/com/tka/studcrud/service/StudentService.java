package com.tka.studcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.studcrud.entity.Student;
import com.tka.studcrud.repository.StudentRepositorys;

@Service
public class StudentService {

    @Autowired
    private StudentRepositorys studentRepository;

    public List<Student> listAll() {
		 return studentRepository.findAll();
	}

    public void save(Student std) {
        studentRepository.save(std);
    }


	public Student getStudentById(long id) {
		 return studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
	}

	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);
		
	}

	
}
