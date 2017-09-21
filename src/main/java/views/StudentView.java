package views;
import java.util.Scanner;
public class StudentView extends View {
	Scanner scanner;
	public StudentView() {
		this.scanner = new Scanner(System.in);
	}
	public int menu1() {
		int option;
		do {
			System.out.println("\nWelcome Student");
			System.out.println("To attempt Quiz Enter 1");
			//System.out.println("To check Marks Enter 2");
			option = (int) this.inputFloat();
		}
		while(option!=1 && option!=2);
		return option;
	}
	
	public void getQuizDetails() {
		
	}
}
