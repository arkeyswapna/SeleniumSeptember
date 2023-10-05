package dynamicParameterRunner;

import dynamicParameterStepDefinition.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/dynamicParameterFeatures", glue="dynamicParameterStepDefinition",monochrome=true, publish=true)
public class CreateLeadRunnerClass extends BaseClass {

}
