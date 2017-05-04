package com.neon.scams.domain;

import java.util.Set;

public class Student {

	private Long id;
	private String sname;
	private String snum;
	private String ssex;
	private String sbor;
	private String sclass;
	private String snative;
	private String sschoolday;
	private String sde;
	
	private Set<Innovate> innovates;
	private Set<Activity> activitys;
	private Set<Course> courses;
	private Set<Error> errors;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSbor() {
		return sbor;
	}

	public void setSbor(String sbor) {
		this.sbor = sbor;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getSnative() {
		return snative;
	}

	public void setSnative(String snative) {
		this.snative = snative;
	}

	public String getSschoolday() {
		return sschoolday;
	}

	public void setSschoolday(String sschoolday) {
		this.sschoolday = sschoolday;
	}

	public String getSde() {
		return sde;
	}

	public void setSde(String sde) {
		this.sde = sde;
	}

	public Set<Innovate> getInnovates() {
		return innovates;
	}

	public void setInnovates(Set<Innovate> innovates) {
		this.innovates = innovates;
	}

	public Set<Activity> getActivitys() {
		return activitys;
	}

	public void setActivitys(Set<Activity> activitys) {
		this.activitys = activitys;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<Error> getErrors() {
		return errors;
	}

	public void setErrors(Set<Error> errors) {
		this.errors = errors;
	}



}
