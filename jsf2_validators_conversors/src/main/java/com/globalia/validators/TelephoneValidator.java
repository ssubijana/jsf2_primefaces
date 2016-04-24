package com.globalia.validators;

import java.util.*;
import java.util.regex.*;

import javax.faces.application.*;
import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.validator.*;

@FacesValidator("telephoneValidator")
public class TelephoneValidator implements Validator {

	private final static String TELEPHONE_REGEX = "^\\d{9,9}$";

	private Pattern pattern;

	private Matcher matcher;

	private ResourceBundle resourceBundle;

	public TelephoneValidator() {
		pattern = Pattern.compile(TELEPHONE_REGEX);
		resourceBundle = ResourceBundle.getBundle("com.globalia.messages",
				FacesContext.getCurrentInstance().getViewRoot().getLocale());
	}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		final String telephone = (String)value;

		matcher = pattern.matcher(telephone);
		if (!matcher.matches()) {
			throw new ValidatorException(new FacesMessage(resourceBundle.getString("telephone.error.validation")));
		}

	}

}
