package week6.day3.extentReports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		
		//Step1: setup the physical report path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		//To keep history
		reporter.setAppendExisting(true);
		
		//step2: Create object for ExtentReport
		ExtentReports extent= new ExtentReports();
		
		//step3: Attach the data with physical file 
		extent.attachReporter(reporter);
		
		//step4: Create a testcase and assign testDetails
		                                  //test name    //test Description
		ExtentTest test=extent.createTest("LoginScript","CreateLead with mandatory details");
		test.assignCategory("LeafTapsModule1");
		test.assignAuthor("Subraja");
		
		ExtentTest test1=extent.createTest("LoginScript1","CreateLead with mandatory details");
		test1.assignCategory("LeafTapsModule2");
		test1.assignAuthor("Vidhya");
		
		//step5: step level status
		//To create snapshot using MedianEntityBuilder
		test.pass("Enter Username",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/image.png").build());
		test.pass("Enter Password");
		test.fail("Click Login");
		
		test1.pass("Enter Username");
		test1.pass("Enter Password");
		test1.pass("Click Login");
		
		//Mandatory step
		extent.flush();//similar to perform() in Actions class
		
		//Ran successfully
		
		

	}

}
