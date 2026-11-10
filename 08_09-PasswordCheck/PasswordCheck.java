import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] arg){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your password:");
	String Tp = "jupiter4321";
	String pass = scanner.nextLine();
	if(pass.equals(Tp)) {
		System.out.println("Access granted. Welcome!");
	} else if(!(pass.equals(Tp))) {
		//Fall 1
		System.out.println("Incorrect password. Try again.");
		System.out.println("Enter your password:");
		pass = scanner.nextLine();
		if(pass.equals(Tp)){
		System.out.println("Access granted. Welcome!");
		} else if(!(pass.equals(Tp))) {
		//Fall 2
		System.out.println("Incorrect password. Try again.");
		System.out.println("Enter your password:");
		pass = scanner.nextLine();
		if(pass.equals(Tp)){
		System.out.println("Access granted. Welcome!");
		} else if(!(pass.equals(Tp))) {
		//Fall 3
		if(pass.equals(Tp)){
		System.out.println("Access granted. Welcome!");
		} else {
		System.out.println("Your account is locked. Please contact your administrator.");
		}
		}
		}
	}
	}	
	}
