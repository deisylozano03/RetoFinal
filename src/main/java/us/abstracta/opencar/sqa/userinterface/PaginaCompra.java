package us.abstracta.opencar.sqa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCompra extends PageObject {
    public static final Target Success_Order= Target.the("Orden realizada Correctamente").located(By.xpath("//*[@id=\"content\"]/p[1]"));

}
