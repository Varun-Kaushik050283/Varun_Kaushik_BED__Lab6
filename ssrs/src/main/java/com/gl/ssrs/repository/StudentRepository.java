/**
 * Package for repository
 */
package com.gl.ssrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ssrs.entity.Student;

/**
 * Student repository class
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
