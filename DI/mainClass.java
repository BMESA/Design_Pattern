package DI;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
public class mainClass {
	public static void main(String args[]) throws SAXException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			File fXmlFile = new File("src/DI/config.XML");
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			String sourceMethod =doc.getElementsByTagName("sourceName").item(0).getTextContent();
			String transMethod =doc.getElementsByTagName("transformerName").item(0).getTextContent();
			Object Source=(abstractSource) Class.forName("DI."+sourceMethod).newInstance();
			((abstractSource) Source).setSource();
			Object trans=(abstractTransformer) Class.forName("DI."+transMethod).newInstance();
			((abstractTransformer) trans).trans();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
}
