package com.ps.projects.jpa.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int projectId;
	@ManyToMany(mappedBy = "project")
	private Set<Employee> employees;

}
