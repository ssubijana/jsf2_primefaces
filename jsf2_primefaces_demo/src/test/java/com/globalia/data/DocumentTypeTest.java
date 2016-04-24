package com.globalia.data;

import static org.junit.Assert.*;

import org.junit.*;

public class DocumentTypeTest {

	@Test
	public void getCodeShouldRecoverInfo() {
		DocumentType documentTypeDNI = DocumentType.DNI;
		DocumentType documentTypeNIE = DocumentType.NIE;
		DocumentType documentTypePP = DocumentType.PASSPORT;

		assertNotNull(documentTypeDNI.getCode());
		assertNotNull(documentTypeNIE.getCode());
		assertNotNull(documentTypePP.getCode());
	}

	@Test
	public void decodeShouldReturnDocumentType() {
		DocumentType documentType = DocumentType.decode("ID");
		assertNotNull(documentType);

		DocumentType invalidDocumentType = DocumentType.decode("asdf");
		assertNull(invalidDocumentType);
	}

}
