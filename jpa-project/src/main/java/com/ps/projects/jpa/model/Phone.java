package com.ps.projects.jpa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Phone {
	@Id
	private int phoneNO;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_employee")
	private Employee employee;

}
