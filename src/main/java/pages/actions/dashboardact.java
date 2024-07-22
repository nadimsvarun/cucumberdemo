package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.dasboardloc;
import utils.seleniumdriver;

import java.io.IOException;

public class dashboardact {

    dasboardloc dbl = null;


    public dashboardact() {

        this.dbl = new dasboardloc();
        PageFactory.initElements(seleniumdriver.getdriver(), dbl);
    }

    public void logintodashboard() throws IOException {

        dbl.username.sendKeys(seleniumdriver.getproperty("username"));
        dbl.password.sendKeys(seleniumdriver.getproperty("password"));
        dbl.signin.click();

    }

    public void clickonbillpay() {

        seleniumdriver.waitforele(dbl.billpay);
        dbl.billpay.click();

    }

    public String getdashboardurl() {

        String url = seleniumdriver.getdriver().getCurrentUrl();
        return url;
    }

    public void enterpayeename(String pname){

        dbl.payeename.sendKeys(pname);
    }
    public void enteraddress(String address){

       dbl.address.sendKeys(address);
    }
    public void entercity(String city){

        dbl.city.sendKeys(city);
    }
    public void enterstate(String state){

        dbl.state.sendKeys(state);
    }
    public void enterzipcode(String zipcode){

        dbl.zipcode.sendKeys(zipcode);
    }
    public void enterphone(String phone){

        dbl.phoneno.sendKeys(phone);
    }
    public void enteraccount(String account){

        dbl.acctno.sendKeys(account);
    }
    public void enterverifyaccount(String verifyaccount){

        dbl.verifyacct.sendKeys(verifyaccount);
    }
    public void enteramount(String amount){

        dbl.amount.sendKeys(amount);
    }
    public void fromaccount(String fromact){

        dbl.fromactid.sendKeys(fromact);
    }

    public void clicksend() throws InterruptedException {

        dbl.sendpay.click();
        Thread.sleep(2000);
    }











}
