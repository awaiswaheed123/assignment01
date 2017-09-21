package controllers;
import views.LoginView;
import models.user;

public class LoginController {
	LoginView Log1;
	user student;
	user instructor;
	
	public LoginController() {
		this.Log1 = new LoginView();
		this.student = new user("Awais","password","student",0);
		this.instructor = new user("Suchal","password","instructor",0);
	}
public user index(){
	while(true) {
		String[] data = this.Log1.getData();
		if(this.student.login(data[0], data[1])) {
			return this.student;
		}
		
		else if(this.instructor.login(data[0], data[1])) {
			return this.instructor;
		}
		else {
			System.out.println("******Wrong Input*****");
		}
	}
	
}


}
