package com.yds.api.web.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

import com.yds.api.service.EmailService;

/**
 * @author nikhil
 * @date Mar 26, 2018
 */
@RestController
public class UserController {
	
	@Resource
	private EmailService emailService;
}
