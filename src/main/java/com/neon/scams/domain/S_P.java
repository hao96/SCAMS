package com.neon.scams.domain;

public class S_P {

	private Long id;
	private String core;
	private String term;
	
	private Student student;
	private Pe pe;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Pe getPe() {
		return pe;
	}
	public void setPe(Pe pe) {
		this.pe = pe;
	}
}
