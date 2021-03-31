package Listeners;

import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.BeforeSuite;
import org.testng.xml.XmlSuite;

public class ListenerTwo implements IReporter {
	
	public void generateReport(List<XmlSuite> xmlSuite , List<ISuite> suites, String outputDirectory ) {
		
		for(ISuite isuite : suites) {
			String suitename = isuite.getName();
			Map<String, ISuiteResult> suiteresult = isuite.getResults();
			
		for(ISuiteResult sr : suiteresult.values()) {
			ITestContext tc = sr.getTestContext();
			System.out.println("Passed tests for suite '" + suitename +"' is:" + tc.getPassedTests().getAllResults().size());
		    System.out.println("Failed tests for suite '" + suitename +"' is:" + tc.getFailedTests().getAllResults().size());
		    System.out.println("Skipped tests for suite '" + suitename +"' is:" + tc.getSkippedTests().getAllResults().size());	
		}
	}
		
}
	
	@BeforeSuite
	public void setUpBeforeSuite(ITestContext context) {
		TestRunner testrunner = (TestRunner)context;
		testrunner.setOutputDirectory("D:\\Users\\SKhuswah\\eclipse-workspace\\TestNGPractice\\test-output\\MyReport");
	}

}

