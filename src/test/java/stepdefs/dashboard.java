package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.actions.dashboardact;
import pages.actions.pageoneact;
import utils.seleniumdriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class dashboard {

    dashboardact dbact = new dashboardact();
    pageoneact pone = new pageoneact();

    @Given("User is on dashboard page")
    public void userIsOnDashboardPage() {

        System.out.println("url is :"+dbact.getdashboardurl());
        Assert.assertTrue(dbact.getdashboardurl().contains("https://parabank.parasoft.com/"));
    }

    @When("User clicks on Bill Pay")
    public void user_clicks_on_bill_pay() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        dbact.clickonbillpay();
        Thread.sleep(2000);

    }

    @Then("User enters Payee details")
    public void user_enters_payee_details(DataTable dt) {

        List<Map<String,String>> mp = dt.asMaps(String.class, String.class);

       // System.out.println(mp.get(0).get("name"));
        dbact.enterpayeename(mp.get(0).get("name"));
        dbact.enteraddress(mp.get(0).get("address"));
        dbact.entercity(mp.get(0).get("city"));
        dbact.enterstate(mp.get(0).get("state"));
        dbact.enterzipcode(mp.get(0).get("zipcode"));
        dbact.enterphone(mp.get(0).get("phone"));
        dbact.enteraccount(mp.get(0).get("account"));
        dbact.enterverifyaccount(mp.get(0).get("verifyaccount"));
        dbact.enteramount(mp.get(0).get("amount"));
        dbact.fromaccount(mp.get(0).get("fromaccount"));


    }

    @And("User clicks on Send Payment")
    public void userClicksOnSendPayment() throws InterruptedException {

        dbact.clicksend();

    }


    @Then("User enters data into all fields in signup")
    public void userEntersDataIntoAllFieldsInSignup(DataTable dt) throws InterruptedException, IOException {

        List<Map<String,String>> mp = dt.asMaps(String.class, String.class);
        pone.enter_firstname(mp.get(0).get("FirstName"));
        pone.enter_lastname(mp.get(0).get("LastName"));
        pone.enter_address(mp.get(0).get("Address"));
        pone.enter_city(mp.get(0).get("City"));
        pone.enter_state(mp.get(0).get("State"));
        pone.enter_zipcode(mp.get(0).get("ZipCode"));
        pone.enter_phoneno(mp.get(0).get("Phone"));
        pone.enter_SSN(mp.get(0).get("SSN"));
        String uname = pone.generaterandomuserid(mp.get(0).get("Username"));
        seleniumdriver.setproperty("username",uname);
        pone.enter_username(pone.generaterandomuserid(uname));
        pone.enter_password(mp.get(0).get("Password"));
        pone.confirm_password(mp.get(0).get("ConfirmPassword"));

    }
}
