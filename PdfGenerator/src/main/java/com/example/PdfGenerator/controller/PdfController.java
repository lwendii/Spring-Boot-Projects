package com.example.PdfGenerator.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PdfGenerator.service.PdfService;

@RestController
public class PdfController {
	private PdfService pdfService;
	
	public PdfController(PdfService pdfService) {
		this.pdfService = pdfService;
	}
	
  @GetMapping("/api/report")
  public void getAllUsersCsvExport(HttpServletResponse response){
    var report = pdfService.generate();
//    return ResponseEntity.ok()
//      .contentType(MediaType.APPLICATION_PDF)
//      .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"report.pdf\"")
//      .body(report);
  }
}
