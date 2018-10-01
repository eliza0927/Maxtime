package co.com.ChoucairTesting.RegTiempo.Maxtime.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
			features="src/test/resources/features/RegistroTiempoMaxTime.feature",
			tags= " @RegistroTiempoLaboral",
			glue="co.com.ChoucairTesting.RegTiempo.Maxtime.StepDefinitions",
			snippets=SnippetType.CAMELCASE	
			
			
			)


public class RegistroTiempoMaxTimeRunner {

}
