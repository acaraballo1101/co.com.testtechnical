package co.com.testtechnical.tasks;

import co.com.testtechnical.interactions.esperas.Esperar;
import co.com.testtechnical.interactions.esperas.EsperarCarga;
import co.com.testtechnical.interactions.esperas.EsperarElemento;
import co.com.testtechnical.userinterfaces.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.testtechnical.userinterfaces.PaginaInicio.*;


public class VisualizarPdfProhibiciones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EsperarCarga.desaparezca(),
                EsperarElemento.esClickable(BTN_PROD_SERVICIOS),
                Click.on(BTN_PROD_SERVICIOS),
                Esperar.unTiempo(2000),
                EsperarElemento.esClickable(BTN_PRESTAMOS),
                Click.on(PaginaInicio.BTN_PRESTAMOS),
                Esperar.unTiempo(2000),
                EsperarElemento.esClickable(BTN_PRESTAMOS_AUTOS),
                Scroll.to(BTN_PRESTAMOS_AUTOS),
                Click.on(PaginaInicio.BTN_PRESTAMOS_AUTOS),
                Esperar.unTiempo(2000),
                EsperarElemento.esClickable(BTN_TASA_TARIFA),
                Click.on(PaginaInicio.BTN_TASA_TARIFA),
                Esperar.unTiempo(2000),
                EsperarElemento.esClickable(BTN_VISUALIZAR_PDF),
                Scroll.to(BTN_VISUALIZAR_PDF),
                Click.on(PaginaInicio.BTN_VISUALIZAR_PDF),
                Esperar.unTiempo(2000)
        );

    }

    public static VisualizarPdfProhibiciones ya(){
        return Tasks.instrumented(VisualizarPdfProhibiciones.class);
    }
}
