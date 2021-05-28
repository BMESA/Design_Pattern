package UI;

import java.io.IOException;

import org.xml.sax.SAXException;

public class main {
	public static void main(String []args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SAXException, IOException {
		UI view=new UI();
		view.init();
		view.display();
		view.validate();
		
	}
}
