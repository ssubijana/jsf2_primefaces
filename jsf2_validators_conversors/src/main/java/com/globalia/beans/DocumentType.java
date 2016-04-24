package com.globalia.beans;

public enum DocumentType {
	ID("ID"), NIE("NIE"), PASSPORT("PP");

	private final String code;

	private DocumentType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
