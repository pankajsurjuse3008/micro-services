package com.ps.projects.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class EmployeePeriod {
	
	@Column(name="EmployeeStartDate")
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Column(name="EmployeeEndDate")
	@Temporal(TemporalType.DATE)
	private Date endDate;

}
