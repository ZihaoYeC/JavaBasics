import java.util.Scanner;

public class ReverseNumber{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int cod = 0;
	int decod = 0;
	while(cod <= 0){
	System.out.println("Enter number > 0:");
	cod = scanner.nextInt();
	} 
	int digit =(int) Math.log10(cod)+1;
	while(digit != 0){
	decod = cod % 10;
	cod /= 10;
	System.out.print(decod);
	/*if(cod % 10 == 0){
		"0" += decode;
	}*/
	digit--;
	}
	//System.out.println(decod);
	}
}