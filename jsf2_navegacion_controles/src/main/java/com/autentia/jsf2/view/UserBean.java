package com.autentia.jsf2.view;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.ValidatorException;

@ManagedBean
@SessionScoped
public class UserBean {

	private String firstName;
	private String lastName;
	private Date   dob;
	private String sex;
	private String email;
	private String serviceLevel = "medium";

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public void validateEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
		if (((String) value).indexOf("@") == -1) {
			throw new ValidatorException(new FacesMessage("El email no es válido"));
		}
	}

	public String addConfirmedUser() {
		// Realizariamos las operaciones de inserción del usuario
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El usuario ha sido dado de alta correctamente"));
		
		return "ok";
	}
}

