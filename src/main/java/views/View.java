package views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	protected Scanner scanner;
	
	public View() {
		this.scanner = new Scanner(System.in);
	}
	
	protected float inputFloat() {
		while(true) {
			try {
				float val = this.scanner.nextFloat();
				return val;
			}catch(InputMismatchException $e) {
				this.scanner.nextLine();
			}
		}
	}
	
	protected String inputString() {
		while(true) {
			try {
				String val = this.scanner.next();
				return val;
			}catch(InputMismatchException $e) {
				this.scanner.nextLine();
			}
		}
	}
}
