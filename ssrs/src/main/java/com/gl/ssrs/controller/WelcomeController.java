/**
 * Package for controller files
 */
package com.gl.ssrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Welcome controller to intercept all the request coming from first landing
 * page
 */
@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String displayWelcomePage() {
		return "welcome";
	}

	@RequestMapping("/")
	public String displayStudentList() {
		return "redirect:/students/list";
	}
}
