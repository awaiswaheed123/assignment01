
package quiz_system;
import controllers.LoginController;
import controllers.InstructorController;
import controllers.StudentController;
import models.user;

public class app {
	private LoginController logincontroller;
	private InstructorController instructorcontroller;
	private StudentController studentcontroller;
	public user currentuser;
	
	
	public app() {
		this.logincontroller = new LoginController();
		this.instructorcontroller = new InstructorController();
		this.studentcontroller = new StudentController();
		
	}
	public static void main(String[] args) {
		app app1 = new app();
		app1.currentuser = app1.logincontroller.index();
		System.out.println("Welcome " + app1.currentuser.getName());
		if (app1.currentuser.getRole().equals("instructor")) {
			app1.instructorcontroller.menu();
			
		}
		else {
			app1.studentcontroller.menu();
		}
	}
	
}
