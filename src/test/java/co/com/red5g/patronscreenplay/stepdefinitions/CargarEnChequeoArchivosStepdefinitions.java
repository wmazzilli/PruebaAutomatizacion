package co.com.red5g.patronscreenplay.stepdefinitions;

import co.com.red5g.patronscreenplay.models.builders.ActorBuilder;
import co.com.red5g.patronscreenplay.models.builders.UrlFinsonetBuilder;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CargarEnChequeoArchivosStepdefinitions {

    @Managed
    private WebDriver webDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ActorBuilder.con().conNombreActor().getNombreActor());
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }

    //UrlFinsonetBuilder.con().getUrl()
    @Dado("Que el usuario este en finsonet modulo de originacion")
    public void queElUsuarioEsteEnFinsonetModuloDeOriginacion() {
        OnStage.theActorInTheSpotlight().
                wasAbleTo(Open.url(UrlFinsonetBuilder.con().conLaUrl().getUrl()));
    }

    @Cuando("Ingrese al tap de chequeo de documento")
    public void ingreseAlTapDeChequeoDeDocumento() {

    }

    @Entonces("Cargaremos los documentos necesarios para su validacion")
    public void cargaremosLosDocumentosNecesariosParaSuValidacion() {

    }

}
