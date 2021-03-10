package edu.bu.met.cs665.email;

/**
 * Name: Lakshmi Swethadri Date: 03/09/2021 Course: CS-665 Assignment 3
 * Description: Email class to get and set subject, header greeting, body,
 * footer greeting Represents Email generation.
 * 
 */

public class Email {
	private String subject;
	private String headerGreeting;
	private String body;
	private String footerGreeting;

	public Email(String subject, String headerGreeting, String body, String footerGreeting) {
		super();
		this.subject = subject;
		this.headerGreeting = headerGreeting;
		this.body = body;
		this.footerGreeting = footerGreeting;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getHeaderGreeting() {
		return headerGreeting;
	}

	public void setHeaderGreeting(String headerGreeting) {
		this.headerGreeting = headerGreeting;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFooterGreeting() {
		return footerGreeting;
	}

	public void setFooterGreeting(String footerGreeting) {
		this.footerGreeting = footerGreeting;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("\n");
		s.append(subject);
		s.append("\n");
		s.append("\n");
		s.append(headerGreeting);
		s.append("\n");
		s.append("\n");
		s.append(body);
		s.append("\n");
		s.append("\n");
		s.append(footerGreeting);
		return s.toString();

	}

}
