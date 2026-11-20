import java.util.Scanner;

public class CountEvens{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int count = 0;
	int ber;
	String tcount ="";
	do{
	System.out.println("Enter number:");
	ber = scanner.nextInt();
	if(ber%2 == 0 && ber != -1) {
		count++;
		tcount += ber+" ";
	}
	}while(ber != -1);
	System.out.println("Even numbers: "+count);
	System.out.print("Numbers: "+tcount);
	} 
}