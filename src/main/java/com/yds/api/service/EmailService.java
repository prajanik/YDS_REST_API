package com.yds.api.service;

/**
 * @author nikhil
 * @date Mar 26, 2018
 */
public interface EmailService {

	void send(String subject, String body, String to);
	
}
