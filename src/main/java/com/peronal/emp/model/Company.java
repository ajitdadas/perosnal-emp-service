package com.peronal.emp.model;

import java.util.Date;

public class Company {
	
	private String id;
	
	private String name;
	
	private boolean isCurrentCompany;
	
	private Date startDate;
	
	private Date endDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCurrentCompany() {
		return isCurrentCompany;
	}

	public void setCurrentCompany(boolean isCurrentCompany) {
		this.isCurrentCompany = isCurrentCompany;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
