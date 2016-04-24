package com.globalia.beans;

import java.io.*;

import javax.faces.bean.*;
import javax.faces.context.*;

@ManagedBean(name = "detailUserView")
public class DetailUserView implements Serializable {

	private static final long serialVersionUID = 3654981213592773201L;

	@ManagedProperty("#{flash}")
	private Flash flash;

	public void setFlash(Flash flash) {
		this.flash = flash;
	}

	public String getName() {
		if (flash != null && flash.get("name") != null) {
			return (String)flash.get("name");
		}
		return null;
	}

	public String getAddress() {
		if (flash != null && flash.get("address") != null) {
			return (String)flash.get("address");
		}
		return null;
	}

	public String getDocument() {
		if (flash != null && flash.get("document") != null) {
			return (String)flash.get("document");
		}
		return null;
	}

	public String getTelephone() {
		if (flash != null && flash.get("telephone") != null) {
			return (String)flash.get("telephone");
		}
		return null;
	}

}
