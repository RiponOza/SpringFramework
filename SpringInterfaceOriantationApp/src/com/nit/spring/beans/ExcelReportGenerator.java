package com.nit.spring.beans;

public class ExcelReportGenerator implements ReportGenerator {

	@Override
	public void genereteReport() {
		System.out.println("Report generated in excel format....");
	}

}
