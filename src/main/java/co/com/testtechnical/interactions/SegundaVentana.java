package co.com.testtechnical.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SegundaVentana implements Interaction {
    private String titulo;
    public SegundaVentana(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver=BrowseTheWeb.as(actor).getDriver();
        Set<String> windowslist;
        windowslist=driver.getWindowHandles();
        for(String ventana:windowslist){
            driver.switchTo().window(ventana);
            if(driver.getTitle().contains(titulo)){
                break;
            }
        }
          }

    public static SegundaVentana a(String titulo){

        return Tasks.instrumented(SegundaVentana.class,titulo);
    }
}