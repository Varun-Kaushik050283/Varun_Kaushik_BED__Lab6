/**
 * Package for controller
 */
package com.gl.ssrs.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.ssrs.entity.Student;
import com.gl.ssrs.service.StudentService;

/**
 * Student Controller class
 */
@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/list")
	public String fetchStudentsList(Model model) {
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		return "list-students";
	}

	@RequestMapping("/displayStudentForm")
	public String addNewStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}

	@RequestMapping("/displayStudentForm_Update")
	public String updateExistingStudent(@RequestParam("studentId") int studentId, Model model) {
		Student student = studentService.findById(studentId);
		model.addAttribute("student", student);
		return "student-form";
	}

	@PostMapping("/save")
	public String saveDetailsOfStudent(@RequestParam("id") int id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("course") String course,
			@RequestParam("country") String country) {
		studentService.saveOrUpdate(id, firstName, lastName, course, country);
		return "redirect:/students/list";
	}

	@RequestMapping("/delete")
	public String deleteDetailsOfStudent(@RequestParam("studentId") int id) {
		studentService.deleteById(id);
		return "redirect:/students/list";
	}

	@RequestMapping("/403")
	public ModelAndView handleAccessDeniedError(Principal user) {
		ModelAndView modelAndView = new ModelAndView();
		String userName = (null != user) ? user.getName() : "user";
		modelAndView.addObject("msg", "Hi " + userName + ", you do not have permission to access this page !");
		modelAndView.setViewName("authorization-error-403");
		return modelAndView;
	}

}
