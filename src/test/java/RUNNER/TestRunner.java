package RUNNER;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\capitolPrint\\src\\test\\java\\Feature\\country.feature",
		glue={"StepDef"}
		)
public class TestRunner {

}
