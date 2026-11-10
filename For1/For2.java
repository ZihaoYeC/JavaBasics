import java.util.Scanner;

public class ForClasseDAW1A{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter starting number");
	int start = scanner.nextInt();
	System.out.println("Enter ending number");
	int end = scanner.nextInt();
	
	
	int exact = 0;
	int ignoringCase = 0;
	System.out.println("Enter text:");
	String text = scanner.nextLine();
	//	for(int i = 1; i <= number; 1++) {
	for(int i = 0; i < number; 1++) {
		System.out.ptintln("Enter text"+(i+1+":");
		String t = scanner.nextLine();
		if (t.equals(text)) {
			exacts++;
		} else if (t.equalsIgnoreCase(text))
			ignoringCase++;
		}
	}
}