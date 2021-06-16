package us.abstracta.opencar.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.abstracta.opencar.sqa.userinterface.PaginaYourStore.*;
public class IrAlProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Mac").into(Search_Option),
                Click.on(Search_Button),
                Click.on(Mac_Button)
        );
    }
    public static IrAlProducto theProduct(){
        return instrumented(IrAlProducto.class);
    }
}
