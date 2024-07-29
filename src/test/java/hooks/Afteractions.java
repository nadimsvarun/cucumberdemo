package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import utils.seleniumdriver;

public class Afteractions {

    @After(order=0)
    public static void teardown(){

        seleniumdriver.teardown();

    }
    @After(order=1)
    public void failure(Scenario sc){

        if(sc.isFailed()){

            String ssname = sc.getName().replaceAll(" ","_");
            byte[] spath = ((TakesScreenshot)seleniumdriver.getdriver()).getScreenshotAs(OutputType.BYTES);
            sc.attach(spath,"image/png",ssname);

        }
    }

}
