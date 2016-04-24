package com.globalia.beans;

import java.io.*;
import java.util.*;

import javax.faces.bean.*;

import com.globalia.data.*;

@ManagedBean(name = "userBean")
public class UserBean implements Serializable {

	private static final long serialVersionUID = -6379459492005617461L;

	private String name;

	private Date bornDate;

	private DocumentType documentType;

	private String document;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

}
