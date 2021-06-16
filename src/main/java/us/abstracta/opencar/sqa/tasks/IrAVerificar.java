package us.abstracta.opencar.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.abstracta.opencar.sqa.userinterface.PaginaVerificar.*;

public class IrAVerificar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Configuration_Button),
                Click.on(Security_Button),
                Enter.theValue("deka12000@hotmail.com").into(Email),
                Enter.theValue("Debra/93").into(Password),
                Click.on(Login_Button),
                Click.on(Step2_Button),
                Click.on(Step3_Button),
                Click.on(Step4_Button),
                Click.on(TermAndCondition_Check),
                Click.on(Step5_Button),
                Click.on(ConfirmOrder_Button)
        );
    }
    public static IrAVerificar theCheckOut(){
        return instrumented(IrAVerificar.class);
    }

}
