package com.globalia.data;

import org.apache.commons.lang3.*;

public enum DocumentType {

	DNI("ID", "dni.label"), NIE("NIE", "nie.label"), PASSPORT("PP", "passport.label");

	private final String code;

	private final String description;

	private DocumentType(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public static DocumentType decode(String code) {
		if (StringUtils.isNotBlank(code)) {
			DocumentType[] documentTypes = DocumentType.values();
			for (DocumentType documentType : documentTypes) {
				if (documentType.getCode().equals(code)) {
					return documentType;
				}
			}
		}
		return null;
	}

}
