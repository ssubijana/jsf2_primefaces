package com.globalia.beans;

import java.io.*;
import java.util.*;

import javax.annotation.*;
import javax.faces.bean.*;

import org.primefaces.context.*;

import com.globalia.data.*;

@ManagedBean(name = "dataView")
public class DataBean implements Serializable {

	private static final long serialVersionUID = -7868397295293608458L;

	private List<DocumentType> documentTypes;

	private boolean availableButton;

	@ManagedProperty("#{userBean}")
	private UserBean user;

	@PostConstruct
	public void initData() {
		documentTypes = new ArrayList<>();
		documentTypes.add(DocumentType.DNI);
		documentTypes.add(DocumentType.NIE);
		documentTypes.add(DocumentType.PASSPORT);
	}

	public List<DocumentType> getDocumentTypes() {
		return documentTypes;
	}

	public void setDocumentTypes(List<DocumentType> documentTypes) {
		this.documentTypes = documentTypes;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public boolean isAvailableButton() {
		return availableButton;
	}

	public void setAvailableButton(boolean availableButton) {
		this.availableButton = availableButton;
	}

	public void showDialog() {
		RequestContext requestContext = RequestContext.getCurrentInstance();

		requestContext.update("form:display");
		requestContext.execute("PF('dlg').show()");
	}

	public void enableButton(boolean enable) {
		availableButton = enable;

		RequestContext requestContext = RequestContext.getCurrentInstance();
		requestContext.update("form:display");
		requestContext.execute("PF('dlg').hide()");
	}

}
