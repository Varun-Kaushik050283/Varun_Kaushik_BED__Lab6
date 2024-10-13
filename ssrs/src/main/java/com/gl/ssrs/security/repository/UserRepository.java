/**
 * Package for User repository
 */
package com.gl.ssrs.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.ssrs.security.entity.User;

/**
 * User repository to fetch all user records 
 */
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u WHERE u.username = ?1")
	public User getUserByUsername(String username);
}
