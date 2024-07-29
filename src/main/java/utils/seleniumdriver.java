package utils;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class seleniumdriver {

    private static seleniumdriver seleniumdriver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private static WebDriverWait wait;
    public final static int TIMEOUT = 30;
    public final static  int PAGE_LOAD_TIMEOUT = 30;

    private seleniumdriver(){

        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
        wait = new WebDriverWait(driver.get(), Duration.ofSeconds(TIMEOUT));
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static  void openpage(String url){

        getdriver().get(url);
    }

    public static WebDriver getdriver(){

        return driver.get();
    }

    public static void setupdriver(){

        if(seleniumdriver==null){

            seleniumdriver = new seleniumdriver();

        }
    }

    public static void teardown(){

        if(driver!=null){


            getdriver().quit();
        }
        seleniumdriver=null;
    }

    public static void waitforele(WebElement ele){

        new WebDriverWait(driver.get(),Duration.ofSeconds(30)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(ele));
        //wait.until(ExpectedConditions.visibilityOf(ele));

    }

    public static void setproperty(String key,String value) throws IOException {

        FileInputStream fin = null;
        FileOutputStream fout = null;
      try {
          Properties prop = new Properties();
          File fil = new File(System.getProperty("user.dir") + "/src/test/resources/Prop/config.properties");
          fin = new FileInputStream(fil);
          prop.load(fin);
          prop.setProperty(key, value);
          fout = new FileOutputStream(fil);
          prop.store(fout, null);

      }catch (Exception e){

          e.printStackTrace();
      }


    }

    public static String getproperty(String key) throws IOException {

        Properties prop = new Properties();
        InputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Prop/config.properties");
        //Load properties file
        prop.load(input);
        //get values from properties file
        return prop.getProperty(key);


    }
}
