package us.abstracta.opencar.sqa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaVerificar extends PageObject {
    public static final Target Configuration_Button=Target.the("Configuracion avanzada").located(By.xpath("//*[@id=\"details-button\"]"));
    public static final Target Security_Button=Target.the("Conexion segura").located(By.xpath("//*[@id=\"proceed-link\"]"));
    public static final Target Email = Target.the("Email").located(By.xpath("//*[@id=\"input-email\"]"));
    public static final Target Password= Target.the("Clave").located(By.xpath("//*[@id=\"input-password\"]"));
    public static final Target Login_Button = Target.the("Ingresar").located(By.xpath("//*[@id=\"button-login\"]"));
    public static final Target Step2_Button = Target.the("Direccion").located(By.xpath("//*[@id=\"button-payment-address\"]"));
    public static final Target Step3_Button = Target.the("Confirmar Direccion").located(By.xpath("//*[@id=\"button-shipping-address\"]"));
    public static final Target Step4_Button = Target.the("Forma de pago").located(By.xpath("//*[@id=\"button-shipping-method\"]"));
    public static final Target TermAndCondition_Check = Target.the("Terminos y  Condiciones").located(By.xpath("//*[@id=\"collapse-payment-method\"]/div[1]/div[2]/div[1]/input[1]"));
    public static final Target Step5_Button = Target.the("Continuar").located(By.xpath("//*[@id=\"button-payment-method\"]"));
    public static final Target ConfirmOrder_Button= Target.the("Confirmar Orden").located(By.xpath("//*[@id=\"button-confirm\"]"));
}
