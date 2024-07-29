package utils;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class XmlReader {

    public static Map<String, String> readxml(int ind) throws ParserConfigurationException, IOException, SAXException {

       File file = new File(".\\src\\test\\resources\\data.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(file);
        Map<String,String>mp = new HashMap<>();
        String FirstName = document.getElementsByTagName("FirstName").item(ind).getTextContent();
        mp.put("FirstName",FirstName);
        String LastName = document.getElementsByTagName("LastName").item(ind).getTextContent();
        mp.put("LastName",LastName);
        String Address = document.getElementsByTagName("Address").item(ind).getTextContent();
        mp.put("Address",Address);
        String City = document.getElementsByTagName("City").item(ind).getTextContent();
        mp.put("City",City);
        String State = document.getElementsByTagName("State").item(ind).getTextContent();
        mp.put("State",State);
        String zipcode = document.getElementsByTagName("ZipCode").item(ind).getTextContent();
        mp.put("ZipCode",zipcode);
        String Phone = document.getElementsByTagName("Phone").item(ind).getTextContent();
        mp.put("Phone",Phone);
        String SSN = document.getElementsByTagName("SSN").item(ind).getTextContent();
        mp.put("SSN",SSN);
        String Username = document.getElementsByTagName("Username").item(ind).getTextContent();
        mp.put("Username",Username);
        String Password = document.getElementsByTagName("Password").item(ind).getTextContent();
        mp.put("Password",Password);

        return mp;







    }
}
