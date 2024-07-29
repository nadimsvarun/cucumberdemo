package hooks;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.testng.annotations.BeforeSuite;
import utils.seleniumdriver;

public class Beforeactions {

    @Before
    public static void setup(){

        seleniumdriver.setupdriver();
    }
}
