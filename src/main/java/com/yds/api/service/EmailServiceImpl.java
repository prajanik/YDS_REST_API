package com.yds.api.service;

import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang3.StringUtils;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * @author nikhil
 * @date Mar 26, 2018
 */
@Service
public class EmailServiceImpl implements EmailService{
	
	private static final String PROPERTIES_FILE = "/env.properties";
	private static final String SOURCE ="API";
	
	
	
	private JavaMailSender sender;
	private String defaultFrom;
	private String devEmail;
	private String website;
	
	
	public EmailServiceImpl() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		final Properties properties = new Properties();
		try {
			properties.load(EmailServiceImpl.class.getResourceAsStream(PROPERTIES_FILE));
			
			this.defaultFrom = properties.getProperty("email.from");
			this.devEmail = properties.getProperty("email.devEmailAddress");
			this.website = properties.getProperty("email.website");
			
			mailSender.setHost(properties.getProperty("smtp.host"));
			mailSender.setUsername(properties.getProperty("smtp.username"));
			mailSender.setPassword(properties.getProperty("smtp.password"));
			mailSender.setPort(Integer.parseInt(properties.getProperty("smtp.port")));
			mailSender.setProtocol(properties.getProperty("smtp.protocol"));

			this.sender = mailSender;
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
	

	/* (non-Javadoc)
	 * @see com.yds.api.service.EmailService#send(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void send(String subject, String body, String to) {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		try {
			helper.setFrom(defaultFrom);
			if(!StringUtils.isBlank(to))
				helper.setTo(to);
			else
				helper.setTo(devEmail);
			helper.setText(body,true);
			helper.setSubject(SOURCE +" "+website+ " "+subject);
		} catch (MessagingException e) {
			System.out.println("EMAIL"+e);
		}
		this.sender.send(message);
		
	}

}
