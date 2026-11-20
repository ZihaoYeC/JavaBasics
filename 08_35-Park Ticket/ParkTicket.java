import java.util.Scanner;

public class ParkTicket{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your age:");
	int age = scanner.nextInt();
	System.out.println("Is it a weekday? (true/false)");
	String weekd = scanner.next();
	double prixe = (age < 12 && weekd.equalsIgnoreCase("true")) ? 5.00:
	(age < 12 && weekd.equalsIgnoreCase("false")) ? 9.00:
	(age >= 12 && weekd.equalsIgnoreCase("true")) ? 15.00: 22.00;
	System.out.printf("Ticket price: %.2f €", prixe);
	} 
}