package com.globalia.converters;

import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.convert.*;

import org.apache.commons.lang3.*;

import com.globalia.data.*;

@FacesConverter("documentTypeConverter")
public class DocumentTypeConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (StringUtils.isNotBlank(value)) {
			return DocumentType.decode(value);
		}
		return null;
	}

	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof DocumentType) {
			DocumentType documentType = (DocumentType)value;
			return documentType.getCode();
		} else {
			return "";
		}
	}

}
