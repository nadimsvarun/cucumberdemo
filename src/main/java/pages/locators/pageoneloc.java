package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageoneloc {

    @FindBy(how= How.LINK_TEXT,using = "Register")
    public WebElement register;

    @FindBy(how= How.ID,using = "customer.firstName")
    public WebElement firstname;

    @FindBy(how= How.ID,using = "customer.lastName")
    public WebElement lastname;

    @FindBy(how= How.NAME,using = "customer.address.street")
    public WebElement address;

    @FindBy(how= How.ID,using = "customer.address.city")
    public WebElement city;

    @FindBy(how= How.ID,using = "customer.address.state")
    public WebElement state;

    @FindBy(how= How.ID,using = "customer.address.zipCode")
    public WebElement zipcode;

    @FindBy(how= How.ID,using = "customer.phoneNumber")
    public WebElement phoneno;

    @FindBy(how= How.ID,using = "customer.ssn")
    public WebElement ssn;

    @FindBy(how= How.ID,using = "customer.username")
    public WebElement username;

    @FindBy(how=How.ID,using = "customer.password")
    public  WebElement password;

    @FindBy(how=How.ID,using = "repeatedPassword")
    public  WebElement confirm_password;

    @FindBy(how=How.XPATH,using = "//input[@value='Register']")
    public  WebElement registerbtn;

    @FindBy(how= How.LINK_TEXT,using = "Log Out")
    public WebElement logout;




}
