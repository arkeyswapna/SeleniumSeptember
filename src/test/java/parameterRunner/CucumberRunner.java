package parameterRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/parameterFeatures/Login.feature", glue="parameterStepDefinition",monochrome=true, publish=true)
public class CucumberRunner extends AbstractTestNGCucumberTests{
	 

}
