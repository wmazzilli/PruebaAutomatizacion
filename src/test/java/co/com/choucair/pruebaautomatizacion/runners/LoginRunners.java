package co.com.choucair.pruebaautomatizacion.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "co.com.choucair.pruebaautomatizacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@login")


public class LoginRunners {

}
