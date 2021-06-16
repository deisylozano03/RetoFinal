package us.abstracta.opencar.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.abstracta.opencar.sqa.userinterface.PaginaProducto.*;

public class IrAlCarro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Button_AddToCart),
                Click.on(Button_Cart),
                Click.on(Check_Out)
        );
    }
    public static IrAlCarro theCart(){
        return instrumented(IrAlCarro.class);
    }
}
