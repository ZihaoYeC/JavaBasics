import java.util.Scanner;

public class EscapeRoom{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number of keys:");
	int keys = scanner.nextInt();
	System.out.println("Final riddle solved? (true/false)");
	String soriddle = scanner.next();
	System.out.print((keys >= 3 && soriddle.equalsIgnoreCase("true")) ? "Door unlocked! Escape successful!":(keys < 3 && soriddle.equalsIgnoreCase("true")) ? "Not enough keys! Still trapped!":"Door unlocked! Still trapped!");
	} 
}