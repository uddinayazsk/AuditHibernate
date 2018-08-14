package com.pki.spring.auditing.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

@JsonIgnoreProperties(ignoreUnknown=true)
public class InputRequest<T> {
	@JsonProperty(value="userid",required=true)
	private String loggedInUser;
	private String timezone;
	private T employee;
	
	
	/*public InputRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InputRequest(String loggedInUser, String timezone, T employee) {
		super();
		this.loggedInUser = loggedInUser;
		this.timezone = timezone;
		this.employee = employee;
	}*/

	/*public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getLoggedInUser() {
		return loggedInUser;
	}
	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	public T getEmployee() {
		return employee;
	}
	public void setEmployee(T employee) {
		this.employee = employee;
	}
	
*/
}
