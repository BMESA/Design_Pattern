package BLL;
import DAO.*;
public class BLL {
	public void findUser(){
		DAO dao = new DAO();
		dao.findUser();
		System.out.println("调用DAO寻找用户");
	}
}
