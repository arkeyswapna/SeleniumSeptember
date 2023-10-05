package dynamicParameterRunner;

import dynamicParameterStepDefinition.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/dynamicParameterFeatures/LoginGroups.feature", glue="dynamicParameterStepDefinition",monochrome=true, publish=true,tags="@Group3")
public class LoginRunnerGroups extends BaseClass{
	 

}
