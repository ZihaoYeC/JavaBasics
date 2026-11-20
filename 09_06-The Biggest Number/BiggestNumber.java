import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter positive numbers. Enter a negative number to finish:");
	int mun1 = 0;
	int big = 0;
	int post = 0;
	do{
	mun1 = scanner.nextInt();
	if(mun1 > big) {
		big = mun1;
		post++;
	}
	} while(mun1 >= 0);
	if(post == 0) {
	System.out.print("No positive numbers were entered");
	} else {
	System.out.print("The biggest number is: "+big);
	}

	} 
}