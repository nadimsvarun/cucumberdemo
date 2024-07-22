package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import org.testng.annotations.AfterSuite;
import utils.seleniumdriver;

public class Afteractions {

    @AfterSuite
    public static void teardown(){

        seleniumdriver.teardown();

    }
}
