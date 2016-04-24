package com.globalia.jsf2.bean;

import java.io.*;

import javax.faces.bean.*;
import javax.faces.context.*;

@RequestScoped
@ManagedBean
public class ResultBean implements Serializable {

	private static final long serialVersionUID = -4413105834112134132L;

	@ManagedProperty("#{flash}")
	private Flash flash;

	public Flash getFlash() {
		return flash;
	}

	public void setFlash(Flash flash) {
		this.flash = flash;
	}

	public String getMessage() {
		if (flash != null && flash.get("message") != null) {
			return "Busqueda de campo: " + (String)flash.get("message");
		}
		return null;
	}

}
