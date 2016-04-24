package com.globalia.converters;

import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.convert.*;

@FacesConverter("telephoneConverter")
public class TelephoneConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		final String telephone = (String)value;
		return "0034 " + telephone;
	}

}
