package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	plugin={"pretty"},
	tags="@homebaner",
	features="src/test/resources/Features",
	glue="Stepdefinitions"
)
public class Runner {

}
