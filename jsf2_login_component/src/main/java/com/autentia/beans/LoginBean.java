package com.autentia.beans;

import java.io.*;

import javax.annotation.*;
import javax.faces.bean.*;
import javax.faces.context.*;
import javax.faces.event.*;

import org.apache.commons.logging.*;

@RequestScoped
@ManagedBean
public class LoginBean implements ActionListener, Serializable {

	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(LoginBean.class);

	private String id;

	private String password;

	@ManagedProperty("#{flash}")
	private Flash flash;

	@PostConstruct
	public void initData() {
		this.id = "DefaultID";

		if (log.isTraceEnabled()) {
			log.trace("PostConstruct LoginBean");
		}
	}

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

	public String getWelcomeMessage() {
		return "Hola " + id + ", bienvenid@!!!!!";
	}

	public void setFlash(Flash flash) {
		this.flash = flash;
	}

	public String login() {
		if (id.equals("User") && password.equals("Password")) {
			return "okLogin";
		} else {
			if (flash != null) {
				flash.put("UserID", id);
			}
			return "koLogin";
		}
	}

	public void processAction(ActionEvent event) throws AbortProcessingException {
		if (log.isTraceEnabled()) {
			log.trace("ActionListener: Submit button has been clicked");
		}
	}

}
