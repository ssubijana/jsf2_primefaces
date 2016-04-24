package com.globalia.data;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.text.*;
import java.util.*;

import org.junit.*;

import com.globalia.beans.*;

public class UserTest {

	private static final String NAME = "name";

	private static final DocumentType DOCUMENT_TYPE = DocumentType.DNI;

	private static final String DOCUMENT = "00000000T";

	private Date bornDate;

	@Test
	public void settersAndGettersShouldWork() throws ParseException {
		final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		bornDate = dateFormat.parse("20/11/1986");

		final UserBean user = new UserBean();
		user.setName(NAME);
		user.setBornDate(bornDate);
		user.setDocumentType(DOCUMENT_TYPE);
		user.setDocument(DOCUMENT);

		assertThat(user.getName(), equalTo(NAME));
		assertThat(user.getDocument(), equalTo(DOCUMENT));
		assertThat(user.getBornDate(), equalTo(bornDate));
		assertThat(user.getDocumentType(), equalTo(DOCUMENT_TYPE));

	}

}
