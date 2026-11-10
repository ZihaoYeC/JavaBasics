import java.util.Scanner;

public class PositiveNegativeZero{
	public static void main(String[] args) {
		System.out.println("Enter an integer:");
	Scanner scanner = new Scanner(System.in);
		int unk = scanner.nextInt();
	if (unk == 0) {
		System.out.printf("The number %d is zero", unk);
	}	else if (unk > 0) { 
	System.out.printf("The number %d is positive", unk);
	}
		else {
	System.out.printf("The number %d is negative", unk);
		}
	}
}