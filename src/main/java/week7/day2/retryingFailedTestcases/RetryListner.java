package week7.day2.retryingFailedTestcases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer{
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(week7.day2.retryingFailedTestcases.RetryFailedTests.class);
	}

}
