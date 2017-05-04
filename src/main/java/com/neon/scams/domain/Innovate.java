package com.neon.scams.domain;

public class Innovate {

	private Long id;
	private String iday;
	private String icon;
	private float iscore;
	private String iterm;
	
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIday() {
		return iday;
	}

	public void setIday(String iday) {
		this.iday = iday;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public float getIscore() {
		return iscore;
	}

	public void setIscore(float iscore) {
		this.iscore = iscore;
	}

	public String getIterm() {
		return iterm;
	}

	public void setIterm(String iterm) {
		this.iterm = iterm;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
