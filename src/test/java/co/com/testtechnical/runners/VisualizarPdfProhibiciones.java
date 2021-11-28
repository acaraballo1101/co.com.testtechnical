package co.com.testtechnical.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.testtechnical.stepdefinitions",dryRun = false)


public class VisualizarPdfProhibiciones {
}
