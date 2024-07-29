package parallel;

import io.cucumber.java.en.Then;
import org.xml.sax.SAXException;
import pages.actions.pageoneact;
import utils.XmlReader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class datafromxml {
    pageoneact pone = new pageoneact();

    @Then("User enters the data into fields from xml file with dataset {int}")
    public void user_enters_the_data_into_fields_from_xml_file_with_dataset(Integer set) throws ParserConfigurationException, IOException, SAXException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Map<String,String> mp = new HashMap<String,String>();
        mp = XmlReader.readxml(set);
        pone.enter_firstname(mp.get("FirstName"));
        pone.enter_lastname(mp.get("LastName"));
        pone.enter_address(mp.get("Address"));
        pone.enter_city(mp.get("City"));
        pone.enter_state(mp.get("State"));
        pone.enter_zipcode(mp.get("ZipCode"));
        pone.enter_phoneno(mp.get("Phone"));
        pone.enter_SSN(mp.get("SSN"));
        String muname = mp.get("Username");
        String uname = pone.generaterandomuserid(muname);
        pone.enter_username(uname);
        pone.enter_password(mp.get("Password"));
        pone.confirm_password(mp.get("Password"));




    }

}
