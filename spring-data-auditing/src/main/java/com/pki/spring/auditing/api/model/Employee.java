package com.pki.spring.auditing.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
//@Table(EMPLOYEE_TB)
@Data public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="MM/dd/yyyy")
	private Date doj;
	private String dept;
	private double Salary;
	
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date lastModifiedDate;
	@CreatedBy
	private String createdBy;
	@LastModifiedBy
	private String modifiedBy;
	public Employee() {
		super();
	}
	public Employee(int id, String name, Date doj, String dept, double salary, Date createdDate, Date lastModifiedDate,
			String createdBy, String modifiedBy) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.dept = dept;
		Salary = salary;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
*/		
}
