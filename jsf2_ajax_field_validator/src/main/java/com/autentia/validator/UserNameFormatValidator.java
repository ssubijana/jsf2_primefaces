package com.autentia.validator;

import javax.faces.application.*;
import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.validator.*;

@FacesValidator("userNameFormatValidator")
public class UserNameFormatValidator implements Validator {

	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		final String userNameValue = (String)value;
		if (userNameValue.length() > 10 || value.equals("InvalidUserName")) {
			throw new ValidatorException(new FacesMessage("Usuario inválido"));
		}
	}

}
