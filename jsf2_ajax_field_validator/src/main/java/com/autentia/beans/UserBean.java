package com.autentia.beans;

import java.io.*;

import javax.faces.application.*;
import javax.faces.bean.*;
import javax.faces.event.*;
import javax.faces.validator.*;

@ViewScoped
@ManagedBean
public class UserBean implements Serializable {

	private static final long serialVersionUID = -6537307288518096585L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void validateName(ValueChangeEvent event) {
		// PREGUNTA: ¿Por qué no se puede hacer algo tan simple como comprobar el valor de name?
		String value = (String)event.getNewValue();
		if (value.length() > 10 || value.equals("InvalidUserName")) {
			throw new ValidatorException(new FacesMessage("Usuario inválido"));
		}
	}

}
