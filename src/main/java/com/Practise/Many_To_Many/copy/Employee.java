package com.Practise.Many_To_Many.copy;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Employee {
	@Id
   private int eid;
   private String name;
   @ManyToMany
   private List<Project> projects;

public Employee(int eid, String name, List<Project> projects) {
	super();
	this.eid = eid;
	this.name = name;
	this.projects = projects;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Project> getProjects() {
	return projects;
}

public void setProjects(List<Project> projects) {
	this.projects = projects;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", projects=" + projects + "]";
}
}
