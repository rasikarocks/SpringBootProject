package com.tka.studcrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String studentname;
	private String course;
	private int fees;

	public Student() {
		super();
	}

	public Student(long id, String studentname, String course, int fees) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fees = fees;
	}

	public Student(String studentname, String course, int fees) {
		super();
		this.studentname = studentname;
		this.course = course;
		this.fees = fees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", course=" + course + ", fees=" + fees + "]";
	}
}
