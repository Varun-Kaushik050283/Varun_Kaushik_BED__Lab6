/**
 * 
 */
package com.gl.ssrs.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.ssrs.security.entity.SsrsUserDetails;
import com.gl.ssrs.security.entity.User;
import com.gl.ssrs.security.repository.UserRepository;

/**
 * Ssrs User Details Service Implementation class of UserDetailsService
 */
public class SsrsUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
        if(null == user) {
          throw new UsernameNotFoundException("User not found with respect to the provided username input.");	
        }
        
		return new SsrsUserDetails(user);
	}

}
