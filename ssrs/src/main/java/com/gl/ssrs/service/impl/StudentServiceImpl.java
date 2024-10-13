/**
 * Package for service
 */
package com.gl.ssrs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ssrs.entity.Student;
import com.gl.ssrs.repository.StudentRepository;
import com.gl.ssrs.service.StudentService;

/**
 * Student Service Implementation class
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student findById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void saveOrUpdate(int id, String firstName, String lastName, String course, String country) {

		Student student = (id == 0) ? new Student(firstName, lastName, course, country) : this.findById(id);
		if (id != 0) {
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setCourse(course);
			student.setCountry(country);
		}
		// Save OR Update of student record.
		this.save(student);
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}

}
