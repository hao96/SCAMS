package com.neon.scams.domain;

public class Error {
	private Long id;
	private String etitle;
	private String econ;
	private String eday;
	private Student	student;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEtitle() {
		return etitle;
	}
	public void setEtitle(String etitle) {
		this.etitle = etitle;
	}
	public String getEcon() {
		return econ;
	}
	public void setEcon(String econ) {
		this.econ = econ;
	}
	public String getEday() {
		return eday;
	}
	public void setEday(String eday) {
		this.eday = eday;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	} 

}
