package com.globalia.jsf2.bean;

import java.io.*;

import javax.faces.application.*;
import javax.faces.bean.*;
import javax.faces.context.*;
import javax.faces.event.*;

import org.apache.commons.lang3.*;

@ViewScoped
@ManagedBean
public class SearchBean implements Serializable {

	private static final long serialVersionUID = -4502013231192763562L;

	@ManagedProperty("#{flash}")
	private Flash flash;

	private String key;

	private String message;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Flash getFlash() {
		return flash;
	}

	public void setFlash(Flash flash) {
		this.flash = flash;
	}

	public void cleanData() {
		message = StringUtils.EMPTY;
		key = StringUtils.EMPTY;
	}

	public String searchData() {
		if (flash != null) {
			flash.put("message", key);
		}
		return "result?faces-redirect=true";
	}

	public void valueChange(ValueChangeEvent event) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error "));
		FacesContext.getCurrentInstance().renderResponse();
	}

}
