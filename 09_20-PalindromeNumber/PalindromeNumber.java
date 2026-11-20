import java.util.Scanner;

public class PalindromeNumber{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a positive number:");
	int code = scanner.nextInt();
	int comp = code;
	int inve = 0;
	int count = 0;
	while(code != 0){
		inve = (inve*10)+code%10;
		code /= 10;
		count++;
	}
	//System.out.println(comp);
	//System.out.println(inve);

	if((count<5||count>7)||(comp != inve)){
	System.out.print("Invalid code");
	} else {
	System.out.print("Valid code");
	}
	
	}
}