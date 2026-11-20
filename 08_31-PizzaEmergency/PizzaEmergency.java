import java.util.Scanner;

public class PizzaEmergency{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter pizza diameter:");
	int pizcm = scanner.nextInt();
	System.out.print((pizcm >= 30) ? "Pizza for everyone!":"You might need another pizza!");
	} 
}