package com.ps.projects.jpa.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EmployeeType")
@DiscriminatorValue(value = "EMP")
public class Employee {

	@Id
	private int employeeId;

	@Basic(optional = false)
	private String employeeName;

	@Embedded
	private EmployeePeriod employeePeriod;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Phone> phones;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = { @JoinColumn(name = "fk_projectId") }, 
	inverseJoinColumns = {
			@JoinColumn( name = "fk_employeeId") })
	private List<Project> projects;

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "AddressId") private Address address;
	 */

}
