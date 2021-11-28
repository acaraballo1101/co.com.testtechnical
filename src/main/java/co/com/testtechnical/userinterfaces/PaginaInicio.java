package co.com.testtechnical.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {

    public static final Target SPN_CARGA =Target.the("Loader de carga").located(By.xpath("//*[@class='loading-inner']"));
    public static final Target BTN_PROD_SERVICIOS=Target.the("btn productos y servicios").locatedBy("//*[@id='navbar-collapse-grid']/ul/li[3]/a");
    public static final Target BTN_PRESTAMOS=Target.the("btn prestamos").locatedBy("//*[contains(text(),'Préstamos')]");
    public static final Target BTN_PRESTAMOS_AUTOS=Target.the("btn prestamos de autos").locatedBy("//*[contains(text(),'Préstamos de Auto')]");
    public static final Target BTN_TASA_TARIFA=Target.the("btn tasa tarifa").locatedBy("//*[contains(text(),'Tasas y tarifas')]");
    public static final Target BTN_VISUALIZAR_PDF=Target.the("btn pdf prohibiciones").locatedBy("//*[@id=\"tab4\"]/table/tbody/tr[2]/td[2]/span/a/img");
    public static final Target EVIDENCIA=Target.the("pdf a Visualizar evidencia").locatedBy("//body[@style='height: 100%; width: 100%; overflow: hidden; margin:0px; background-color: rgb(82, 86, 89);']");
    public static final Target EVIDENCIA_2=Target.the("pdf a Visualizar evidencia").locatedBy("//*[contains(text(),'Prohibiciones Super Intendencia de Bancos SIB')]");

}