package UI;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import BLL.*;
public class UI{
	public void init() {
		System.out.println("初始化窗口");
	}
	public void validate() {
		BLL bll=new BLL();
		bll.findUser();
		System.out.println("验证用户信息");
	}
	public void display() throws SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
	String method = null;
		try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		File Xml = new File("src/UI/config.xml");
		dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(Xml);
		method=doc.getElementsByTagName("className").item(0).getTextContent();
		Object button=(abstractButton) Class.forName("UI."+method).newInstance();
		((abstractButton) button).display();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
