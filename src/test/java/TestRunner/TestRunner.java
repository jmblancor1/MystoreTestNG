package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




    @CucumberOptions(
            tags = "",
            features = "src/test/resources/features", // ruta a tus archivos .feature
            glue = {"StepDefinitions"}, // paquete donde están tus step definitions
            plugin = {"pretty", "html:target/cucumber-reports.html"},
            monochrome = true
    )
    public class TestRunner extends AbstractTestNGCucumberTests {
    }


