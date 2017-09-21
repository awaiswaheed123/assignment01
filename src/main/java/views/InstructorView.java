package views;
import java.util.Scanner;
import models.Quiz;
import models.Question;

public class InstructorView extends View{
	Scanner scanner;
	public InstructorView() {
		this.scanner = new Scanner(System.in);
	}
	public int menu1() {
		int option;
		do {
			System.out.println("\nWelcome Instructor");
			System.out.println("For new Quiz Enter 1");
			//System.out.println("For changes Enter 2");
			option = (int) this.inputFloat();
		}
		while(option!=1 && option!=2);
		return option;
	}
	
	public String[] getQuizDetails() {
		String[] data = new String[2];
		System.out.println("Please enter a Title");
		data[0] = this.inputString();
		System.out.println("\nEnter Details: ");
		data[1] = this.inputString();
		System.out.println("\nTitle:" + data[0]);
		System.out.println("Details:" + data[1]);
		return data;
	}
	
public int editquiz(Quiz quiz) {
	int option1;
	do {
		System.out.println("\nWelcome Instructor");
		System.out.println("To add Question Enter 1");
		//System.out.println("For rearranging Enter 2");
		option1 = (int) this.inputFloat();
	}
	while(option1!=1 && option1!=2);
	return option1;
	}
public Question addquestion() {
	String[] choices = new String[4];
	float answer = 0;
	String statment;
	int type;
	System.out.println("Enter Question Statment");
	statment = this.inputString();
	do {
		System.out.println("Please Enter");
		System.out.println("1 for MCQ");
		System.out.println("2 for True/False Question");
		System.out.println("3 for Numeric Question");
		type = (int) this.inputFloat();
	}while(type!=1 && type!=2 && type!=3);
	
	switch(type) {
	case(1):
		for(int i = 0; i<4; i++) {
			System.out.println("Enter the option ("+ i +")");
			choices[i] = this.inputString();
		}
		System.out.println("Please enter the correct answer");
		answer = this.inputFloat();
		break;
	case(2):
		choices[0]= "True";
		choices[1]= "False";
		System.out.println("Please Enter");
		System.out.println("1 if true.");
		System.out.println("2 if flase.");
		answer = this.inputFloat();
		break;
		
	case(3):
		System.out.println("Please Enter Correct Answer");
		answer = this.inputFloat();
		break;
	}
	Question question = new Question(statment, choices, answer);
	return question;
	
}
}
