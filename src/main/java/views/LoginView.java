package views;
import java.util.Scanner;
public class LoginView extends View{
	Scanner scanner;
	public LoginView(){
		this.scanner = new Scanner(System.in);
	}
	
public String[] getData() {
	String[] data = new String[2];
	System.out.println("-----Welcome--------");
	System.out.println("\nEnter Username: ");
	data[0] = this.inputString();
	System.out.println("\nEnter Password: ");
	data[1] = this.inputString();
	return data;
}
}
