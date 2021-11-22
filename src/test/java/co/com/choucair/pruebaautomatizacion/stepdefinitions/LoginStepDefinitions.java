package co.com.choucair.pruebaautomatizacion.stepdefinitions;

import co.com.choucair.pruebaautomatizacion.models.builders.VariablesBuilder;
import co.com.choucair.pruebaautomatizacion.taks.factories.LoginFactories;
import co.com.choucair.pruebaautomatizacion.userinterfaces.Head;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import co.com.choucair.pruebaautomatizacion.models.builders.ActorBuilder;

public class LoginStepDefinitions {

    @Managed
    private WebDriver webDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ActorBuilder.con().conNombreActor().getNombreActor());
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    @Dado("Que el usuario este en la pagina de la prueba de Choucair")
    public void queElUsuarioEsteEnLaPaginaDeLaPruebaDeChoucair() {
        OnStage.theActorInTheSpotlight().
                wasAbleTo(Open.url(VariablesBuilder.con().conVariales().getUrl()));
    }

    @Cuando("El usuario ingrese su usuario y password para ingresar como cliente")
    public void elUsuarioIngreseSuUsuarioYPasswordParaIngresarComoCliente() {
    OnStage.theActorInTheSpotlight().attemptsTo((LoginFactories.Login()));
    }

    @Entonces("Se realizara la validacion que el cliente se encuentra logueado")
    public void seRealizaraLaValidacionQueElClienteSeEncuentraLogueado() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(Head.FONT_TEXTO_USUARIO_REGISTRADO).
                isEnabled());
    }

}
