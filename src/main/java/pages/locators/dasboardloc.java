package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class dasboardloc {

    @FindBy(how=How.XPATH,using = "//*[@id=\"leftPanel\"]/ul/li[4]/a")
    public  WebElement billpay;

    @FindBy(how=How.XPATH,using = "//*[@id=\"loginPanel\"]/form/div[1]/input")
    public WebElement username;

    @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[2]/input")
    public WebElement password;

    @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[3]/input")
    public WebElement signin;

    @FindBy(how=How.NAME,using="payee.name")
    public WebElement payeename;

    @FindBy(how=How.NAME,using="payee.address.street")
    public WebElement address;

    @FindBy(how=How.NAME,using="payee.address.city")
    public WebElement city;

    @FindBy(how=How.NAME,using="payee.address.state")
    public WebElement state;

    @FindBy(how=How.NAME,using="payee.address.zipCode")
    public WebElement zipcode;

    @FindBy(how=How.NAME,using="payee.phoneNumber")
    public WebElement phoneno;

    @FindBy(how=How.NAME,using="payee.accountNumber")
    public WebElement acctno;

    @FindBy(how=How.NAME,using="verifyAccount")
    public WebElement verifyacct;

    @FindBy(how=How.NAME,using="amount")
    public WebElement amount;

    @FindBy(how=How.NAME,using="fromAccountId")
    public WebElement fromactid;

    @FindBy(how=How.XPATH,using="//input[@value='Send Payment']")
    public WebElement sendpay;









    //payee.address.street
    //payee.address.city
    //payee.address.state
    //payee.address.zipCode
    //payee.phoneNumber
    //payee.accountNumber
    //verifyAccount
    //amount
    //fromAccountId


}
