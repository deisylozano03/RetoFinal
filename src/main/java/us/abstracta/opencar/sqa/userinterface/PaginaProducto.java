package us.abstracta.opencar.sqa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaProducto extends PageObject {
    public static final Target Button_AddToCart = Target.the("Agregar al carro").located(By.xpath("//*[@id=\"button-cart\"]"));
    public static final Target Button_Cart= Target.the("Ir al carro").located(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]"));
    public static final Target Check_Out = Target.the("Ir a check out").located(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a[1]"));
}

