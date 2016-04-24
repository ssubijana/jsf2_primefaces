package com.autentia.beans;

import java.io.*;

import javax.faces.bean.*;
import javax.faces.event.*;

@ViewScoped
@ManagedBean
public class LoginBean implements ActionListener, Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (id.equals("User") && password.equals("Password")) {
			return "okLogin";
		} else {
			return "koLogin";
		}
	}

	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Submit button has been clicked");
	}

}
