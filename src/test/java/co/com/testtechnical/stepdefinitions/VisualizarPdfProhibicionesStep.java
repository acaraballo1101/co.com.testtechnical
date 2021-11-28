package co.com.testtechnical.stepdefinitions;

import co.com.testtechnical.interactions.SegundaVentana;
import co.com.testtechnical.questions.TituloPDF;
import co.com.testtechnical.tasks.VisualizarPdfProhibiciones;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class VisualizarPdfProhibicionesStep {

    @Managed
    WebDriver myDriver;

    //Actor Juan Camilo;

    @Before
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("Andres").can(BrowseTheWeb.with(myDriver));
    }

    @Given("^que (.*) ha ingresado a la pagina$")
    public void queAndresHaIngresadoALaPagina(String actor) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"));
        theActorCalled(actor);
    }

    @When("^el seleccione el pdf a descargar")
    public void elSeleccioneElPdfADescargar() {
        OnStage.theActorInTheSpotlight().attemptsTo(VisualizarPdfProhibiciones.ya());
        OnStage.theActorInTheSpotlight().attemptsTo(SegundaVentana.a("Estado de Situacion Financiera a 30 de noviembre de 2020.pdf"));
    }

    @Then("^el debera visualizar el archivo$")
    public void elDeberaVisualizarElArchivo() {
        OnStage.theActorInTheSpotlight().should(seeThat(TituloPDF.es(),
                is(equalTo(true))));
    }

}
