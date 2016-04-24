package com.globalia.beans;

import java.io.*;

import javax.faces.application.*;
import javax.faces.bean.*;
import javax.faces.context.*;
import javax.faces.event.*;

@ManagedBean(name = "newUserView")
public class NewUserView implements Serializable {

	private static final long serialVersionUID = 1156592647950417508L;

	public void validateTelephone(ValueChangeEvent event) {
		final String telephone = (String)event.getNewValue();

		FacesContext.getCurrentInstance().addMessage(event.getComponent().getClientId(),
				new FacesMessage("Telefono incorrecto 2 " + telephone));
		FacesContext.getCurrentInstance().renderResponse();
	}
}
