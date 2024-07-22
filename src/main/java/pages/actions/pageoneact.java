package pages.actions;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.pageoneloc;
import utils.seleniumdriver;


public class pageoneact {


    pageoneloc poneloc = null;
    Actions act = new Actions(seleniumdriver.getdriver());

    public pageoneact() {

        this.poneloc = new pageoneloc();
        PageFactory.initElements(seleniumdriver.getdriver(), poneloc);


    }

    public void clickonregister() throws InterruptedException {

        seleniumdriver.waitforele(poneloc.register);
        poneloc.register.click();
        Thread.sleep(10);
        seleniumdriver.waitforele(poneloc.firstname);

    }

    public void enter_firstname(String fname) throws InterruptedException {


        poneloc.firstname.sendKeys(fname);
    }

    public void enter_lastname(String lname) {


        poneloc.lastname.sendKeys(lname);
    }

    public void enter_address(String address) {


        poneloc.address.sendKeys(address);
    }

    public void enter_city(String city) {


        poneloc.city.sendKeys(city);
    }

    public void enter_state(String state) {

        poneloc.state.sendKeys(state);


    }

    public void enter_zipcode(String zipcode) {

        poneloc.zipcode.sendKeys(zipcode);
    }

    public void enter_phoneno(String phoneno) {

        poneloc.phoneno.sendKeys(phoneno);
    }

    public void enter_SSN(String ssnno) {

        poneloc.ssn.sendKeys(ssnno);
    }

    public void enter_username(String username) {

        poneloc.username.sendKeys(username);
    }

    public void enter_password(String pwd) {

        poneloc.password.sendKeys(pwd);
    }

    public void confirm_password(String pwd) {

        poneloc.confirm_password.sendKeys(pwd);

    }

    public void click() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) seleniumdriver.getdriver();
        js.executeScript("arguments[0].click();", poneloc.registerbtn);
        Thread.sleep(3000);
    }

    public String getregisterpageurl() {

        String url = seleniumdriver.getdriver().getCurrentUrl();
        return url;
    }

    public void logout() {

        seleniumdriver.waitforele(poneloc.logout);
        poneloc.logout.click();

    }

    public String generaterandomuserid(String username) {

        String name = RandomStringUtils.randomAlphabetic(4);
        name = name.toLowerCase();
        return username + name;
    }

}
