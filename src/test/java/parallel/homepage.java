package parallel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.actions.pageoneact;
import utils.seleniumdriver;

import java.io.IOException;

public class homepage {

    pageoneact pone = new pageoneact();

    @Given("User launches banking demo website url")
    public void user_launches_banking_demo_website_url() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        seleniumdriver.openpage("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(15);
    }

//    @When("User clicks on Register")
//    public void userClicksOnRegister() throws InterruptedException {
//
//        pone.clickonregister();
//    }

    @Then("User enters {string} on the sign up form")
    public void user_enters_on_the_sign_up_form(String fname) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(pone.getregisterpageurl());
        Assert.assertTrue(pone.getregisterpageurl().contains("https://parabank.parasoft.com/parabank/register.htm"));
        pone.enter_firstname(fname);
    }

    @And("User enters {string} lastname")
    public void user_enters_lastname(String lname) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        pone.enter_lastname(lname);


    }

    @And("User enters {string} address")
    public void user_enters_address(String address) {
        // Write code here that turns the phrase above into concrete actions

        pone.enter_address(address);

    }

    @And("User enters {string} city")
    public void user_enters_city(String city) {
        // Write code here that turns the phrase above into concrete actions

        pone.enter_city(city);
    }

    @And("User enters {string} state")
    public void user_enters_state(String state) {
        // Write code here that turns the phrase above into concrete actions
        pone.enter_state(state);
    }

    @And("User enters {string} zipcode")
    public void user_enters_zipcode(String zipcode) {
        // Write code here that turns the phrase above into concrete actions
        pone.enter_zipcode(zipcode);

    }

    @And("User enters {string} phoneno")
    public void user_enters_phoneno(String phoneno) {
        // Write code here that turns the phrase above into concrete actions

        pone.enter_phoneno(phoneno);

    }

    @And("User enters {string} ssn")
    public void user_enters_ssn(String SSN) {
        // Write code here that turns the phrase above into concrete actions
        pone.enter_SSN(SSN);
    }

    @And("User enters {string} username")
    public void user_enters_username(String username) throws IOException {
        // Write code here that turns the phrase above into concrete actions

        String uname = pone.generaterandomuserid(username);

        seleniumdriver.setproperty("username",uname);
        pone.enter_username(pone.generaterandomuserid(username));
    }

    @And("User enters {string} password")
    public void user_enters_password(String password) throws IOException {
        // Write code here that turns the phrase above into concrete actions
        seleniumdriver.setproperty("password",password);
        pone.enter_password(password);
    }

    @And("User enters {string} confirmpassword")
    public void user_enters_confirmpassword(String confirmpassword) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        pone.confirm_password(confirmpassword);

    }

    @Then("User clicks on Register button")
    public void user_clicks_on_register_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        pone.click();
        Thread.sleep(1000);


    }

    @And("User logs out")
    public void userLogsOut() throws InterruptedException, IOException {


           pone.logout();


    }
}
