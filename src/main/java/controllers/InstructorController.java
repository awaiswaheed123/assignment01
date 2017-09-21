package controllers;
import views.InstructorView;
import models.Quiz;
import models.Question;

public class InstructorController {
	
	InstructorView instructorview;
	
	public InstructorController(){
		this.instructorview = new InstructorView();
	}
	
	public void menu() {
		int option = this.instructorview.menu1();
		if(option == 1) {
			this.addQuiz();
		}
	}
	
	public void addQuiz() {
		String[] data = this.instructorview.getQuizDetails();
		Quiz quiz = new Quiz(data[0],data[1]);
		int option = this.instructorview.editquiz(quiz);
		int j = 0;
		if(option == 1) {
			do
				{
				Question question = this.instructorview.addquestion();
				quiz.addtoQuiz(question);
				j++;
				}while(j!=10);
		}
	
	}

	
}
