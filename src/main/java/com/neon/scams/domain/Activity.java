package com.neon.scams.domain;

public class Activity {

	private Long id;
	private String aday;
	private String acon;
	private String ascore;
	private String aterm;
	
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAday() {
		return aday;
	}

	public void setAday(String aday) {
		this.aday = aday;
	}

	public String getAcon() {
		return acon;
	}

	public void setAcon(String acon) {
		this.acon = acon;
	}

	public String getAscore() {
		return ascore;
	}

	public void setAscore(String ascore) {
		this.ascore = ascore;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getAterm() {
		return aterm;
	}

	public void setAterm(String aterm) {
		this.aterm = aterm;
	}
}
