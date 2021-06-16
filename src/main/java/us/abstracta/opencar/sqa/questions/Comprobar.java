package us.abstracta.opencar.sqa.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static us.abstracta.opencar.sqa.userinterface.PaginaCompra.Success_Order;

public class Comprobar{
    public static Question<String> SuccessOrder(){
        return actor -> TextContent.of(Success_Order).viewedBy(actor).asString();
    }
}


