package com.example.PdfGenerator.service;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class PdfServiceImpl implements PdfService {

	public PdfServiceImpl() {
		
	}
	
	@Override
	public Resource generate() {
	        //Load editable pdf file
	        try (PDDocument pdfDoc = PDDocument.load(new File("src/main/resources/templates/editForm.pdf"))) {
	            PDDocumentCatalog docCatalog = pdfDoc.getDocumentCatalog();
	            PDAcroForm acroForm = docCatalog.getAcroForm();

	            PDField firstnameField = acroForm.getField("first_name");
	            firstnameField.setValue("Danny");

	            PDField lastnameField = acroForm.getField("last_name");
	            lastnameField.setValue("Clark");

//	            PDField registrationDateField = acroForm.getField("registration_date");
//	            registrationDateField.setValue(String.valueOf(LocalDate.now()));
//
//	            PDField registrationFeeField = acroForm.getField("registration_fee");
//	            registrationFeeField.setValue(String.valueOf(100.50));

	            /*make the final document uneditable*/
	            acroForm.flatten();
	            /*generate a new pdf file and save it to the given location*/
	            pdfDoc.save(new File("src/main/resources/templates/final-document.pdf"));

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return null;
	    }
}
