package us.abstracta.opencar.sqa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/yourstore.feature",
        glue = "us.abstracta.opencar.sqa.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class YourShopRunner {
}
