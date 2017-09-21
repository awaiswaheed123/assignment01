package controllers;
import views.StudentView;

public class StudentController {
	StudentView studentview;
	
	public StudentController() {
		this.studentview = new StudentView();
	}
	
	public void menu() {
		int option = this.studentview.menu1();
		if(option == 1) {
			this.attemptQuiz();
		}
	}
	
	public void attemptQuiz() {
		this.studentview.getQuizDetails();
	}

}
