package UI;
import BLL.*;
public class UI {
	public void init() {
		System.out.println("初始化窗口");
	}
	public void display() {
		System.out.println("展示窗口");
	}
	public void validate() {
		BLL bll=new BLL();
		bll.findUser();
		System.out.println("验证用户信息");
	}
}
