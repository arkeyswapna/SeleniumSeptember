package dynamicParameterRunner;

import dynamicParameterStepDefinition.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/dynamicParameterFeatures", glue="dynamicParameterStepDefinition",monochrome=true, publish=true, tags="@Group1")
public class LoginCreateLeadRunnerClass extends BaseClass {

}
//not running