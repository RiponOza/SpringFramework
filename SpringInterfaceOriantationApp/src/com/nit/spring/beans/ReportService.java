package com.nit.spring.beans;

public class ReportService implements Service {

	private ReportGenerator reportGenerator;
	
	public void setReportGenerator(ReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	public ReportGenerator getReportGenerator() {
		return reportGenerator;
	}
	
	@Override
	public void showReport() {
		System.out.println("Inside the showReport().....");
		reportGenerator.genereteReport();
	}

}
