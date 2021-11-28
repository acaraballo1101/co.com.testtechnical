package co.com.testtechnical.questions;

import co.com.testtechnical.userinterfaces.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class TituloPDF implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(PaginaInicio.EVIDENCIA).viewedBy(actor).asBoolean();

    }

    public static TituloPDF es () {
        return new TituloPDF();
    }
}