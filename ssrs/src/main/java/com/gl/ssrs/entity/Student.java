/**
 * Package for entity classes
 */
package com.gl.ssrs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Student Entity class
 */
@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "course", nullable = false)
	private String course;

	@Column(name = "country", nullable = false)
	private String country;

	/**
	 * Default Constructor
	 */
	public Student() {
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param course
	 * @param country
	 */
	public Student(String firstName, String lastName, String course, String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}

}
