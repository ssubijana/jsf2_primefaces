package com.globalia.converter;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.faces.component.*;
import javax.faces.context.*;

import org.junit.*;

import com.globalia.converters.*;
import com.globalia.data.*;

public class DocumentTypeConverterTest {

	private DocumentTypeConverter converter = new DocumentTypeConverter();

	@Test
	public void getAsObjectShouldReturnValidDocumentType() {
		Object recoveredObject = converter.getAsObject(mock(FacesContext.class), mock(UIComponent.class), "ID");

		assertThat(recoveredObject, instanceOf(DocumentType.class));
		DocumentType documentType = (DocumentType)recoveredObject;
		assertThat(documentType, equalTo(DocumentType.DNI));
	}

	@Test
	public void getAsStringShouldReturnCode() {
		String documentTypeRepresentation = converter.getAsString(mock(FacesContext.class), mock(UIComponent.class),
				DocumentType.DNI);
		assertThat(documentTypeRepresentation, equalTo("ID"));
	}

}
