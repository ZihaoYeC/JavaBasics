import java.util.Scanner;

public class SumToX{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	
	int numer = 0;
	int numer2 = 0;

	do {
		System.out.println("Enter number > 10:");
		numer = scanner.nextInt();
	} while(numer < 10);
	
	while(numer > 0) {
	numer2+=numer;
	numer--;
	}
	System.out.println("Total = "+numer2);
	} 
}