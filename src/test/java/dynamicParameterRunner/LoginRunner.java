package dynamicParameterRunner;

import dynamicParameterStepDefinition.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/dynamicParameterFeatures/Login.feature", glue="dynamicParameterStepDefinition",monochrome=true, publish=true)
public class LoginRunner extends BaseClass{
	 

}
