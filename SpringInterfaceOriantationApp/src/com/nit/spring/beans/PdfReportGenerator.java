package com.nit.spring.beans;

public class PdfReportGenerator implements ReportGenerator {

	@Override
	public void genereteReport() {
		System.out.println("Report is Generated in pdf format.");
	}

}
