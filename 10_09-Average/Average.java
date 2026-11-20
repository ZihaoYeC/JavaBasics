import java.util.Scanner;

public class Average{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int er = 0;
	double linse = 0;
	double total = 0;
	System.out.println("How many numbers do you want to enter?");
	er = scanner.nextInt();
	while(er <= 0){
	System.out.println("Invalid amount. Please enter a positive number.");
	er = scanner.nextInt();		
	}
	for(int i = 1; i<=er;i++){
	System.out.printf("Enter number %d:\n", i);
	linse = scanner.nextDouble();
	total += linse;
	}
	total /= er;
	System.out.printf("The average is: %.2f", total);	
	} 
	
}