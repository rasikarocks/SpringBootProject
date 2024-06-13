package com.tka.studcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tka.studcrud.entity.Student;
import com.tka.studcrud.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/")
	public String viewHomePage(Model model) {
	    List<Student> listStudent = service.listAll();
	    model.addAttribute("listStudent", listStudent);
	    System.out.println("Get/");
	    return "index";
	}


	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("student", new Student());
		return "new";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student std) {
		service.save(std);
		return "redirect:/";
	}

	 @GetMapping("/edit/{id}")
	    public String showEditForm(@PathVariable("id") long id, Model model) {
	        Student student = service.getStudentById(id);
	        model.addAttribute("student", student);
	        return "edit_student"; // Ensure this matches the name of your Thymeleaf template for editing
	    }

	    @GetMapping("/delete/{id}")
	    public String deleteStudent(@PathVariable("id") long id) {
	        service.deleteStudentById(id);
	        return "redirect:/";
	    }
}
