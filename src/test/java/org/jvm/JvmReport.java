package org.jvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvmReportGeneration(String json) {
		File f = new File("C:\\Users\\Kannan\\eclipse-workspace\\Cucumber\\Reports\\JVM REPORT");
		Configuration c = new Configuration(f, "Social Application");
		c.addClassifications("Operating System", "windows 10 pro");
		c.addClassifications("Browser", "Chrome");
		List<String> l = new ArrayList<String>();
		l.add(json);
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
	}

}
