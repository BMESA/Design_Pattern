package UI;
import BLL.*;
public class UI {
	public void init() {
		System.out.println("��ʼ������");
	}
	public void display() {
		System.out.println("չʾ����");
	}
	public void validate() {
		BLL bll=new BLL();
		bll.findUser();
		System.out.println("��֤�û���Ϣ");
	}
}
