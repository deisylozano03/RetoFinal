package us.abstracta.opencar.sqa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencar.sqa.questions.Comprobar;
import us.abstracta.opencar.sqa.tasks.IrAlCarro;
import us.abstracta.opencar.sqa.tasks.IrAVerificar;
import us.abstracta.opencar.sqa.tasks.IrAlProducto;
import us.abstracta.opencar.sqa.userinterface.PaginaYourStore;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class YourStoreStepDefinition {
        @Managed(driver="chrome")
        private WebDriver hisBrowser;
        private Actor deisy =Actor.named("Deisy");

        @Before
        public void abrirNavegador(){
            deisy.can(BrowseTheWeb.with(hisBrowser));
            deisy.wasAbleTo(Open.browserOn(new PaginaYourStore()));
            hisBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Given("^que Deisy seleccione el computador Mac$")
        public void queDeisySeleccioneElComputadorMac(){
            deisy.attemptsTo(IrAlProducto.theProduct());

        }

        @When("^Deisy agregue al carro el producto$")
        public void DeisyAgregueAlCarroElProducto(){
            deisy.attemptsTo(IrAlCarro.theCart());

        }

        @Then("^se realice la verificacion del producto con la compra realizada exitosamente$")
        public void seRealiceLaVerificacionDelProductoConLaCompraRealizada(){
            deisy.attemptsTo(IrAVerificar.theCheckOut());
            System.out.println(Comprobar.SuccessOrder().answeredBy(deisy));
            deisy.should(
                    seeThat("La compra ha sido realizada",Comprobar.SuccessOrder(),equalTo("Your order has been successfully processed!")));

        }
    }

