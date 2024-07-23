package runner;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.seleniumdriver;


@CucumberOptions(features = {"src/test/resources/features"},
        glue={"stepdefs","hooks"},
        plugin={"pretty", "html:target/cucumber-report.html"},
        monochrome = true,
        tags="@Datatable or @Scenariooutline"


)
public class runner extends AbstractTestNGCucumberTests {


/*
 @BeforeSuite
 public void setup() {
     seleniumdriver.setupdriver();
 }

 @AfterSuite
    public void teardown(){

     seleniumdriver.teardown();
 }*/

}


