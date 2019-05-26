import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        try {

            File xmlFile = new File("/home/dani/FLOW2019/3.Szakasz/05.23./XML+.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            NodeList catList = doc.getElementsByTagName("cat");

            for (int temp = 0; temp < catList.getLength(); temp++) {

                Node nNode = catList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Staff id : " + eElement.getAttribute("id"));
                    System.out.println("First Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Last Name : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    System.out.println("Nick Name : " + eElement.getElementsByTagName("age").item(0).getTextContent());

                }
            }
        } catch (ParserConfigurationException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } catch (SAXException e) {
            e.getMessage();
        }
    }
}
