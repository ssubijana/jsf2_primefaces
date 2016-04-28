package com.autentia.beans;

import java.io.*;

import javax.annotation.*;
import javax.faces.bean.*;
import javax.faces.context.*;

import org.apache.commons.lang3.*;
import org.apache.commons.logging.*;

@ManagedBean
@RequestScoped
public class LoginErrorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(LoginErrorBean.class);

	@ManagedProperty("#{flash}")
	private Flash flash;

	@PostConstruct
	public void initData() {
		if (log.isTraceEnabled()) {
			log.trace("PostConstruct LoginErrorBean");
		}
	}

	public void setFlash(Flash flash) {
		this.flash = flash;
	}

	public String getErrorMessage() {
		String idError = StringUtils.EMPTY;
		if (flash != null) {
			idError = (String)flash.get("UserID");
		}
		return "Acceso inválido para " + idError;
	}

}
