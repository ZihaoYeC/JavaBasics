import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args){
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num % 2 == 0) System.out.printf("The number %d is even", num);
		else System.out.printf("The number %d is odd", num);
	}
}