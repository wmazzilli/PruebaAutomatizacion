package co.com.red5g.patronscreenplay.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/chequeo.feature",
        glue = "co.com.red5g.patronscreenplay.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@ChequeoDocumento")



public class CargarEnChequeoRunners {


}
