import java.util.Scanner;

public class BinaryConversion{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a positive number:");
	double tobi = scanner.nextDouble();
	String total = "";
	while(tobi != 0) {
	tobi /= 2;
	//System.out.println(tobi);
	if(tobi % 1 == 0) {
		total = "0"+total;
		//System.out.println("entero");
	} else {
		total = "1"+total;
		//System.out.print("1");
	}
	tobi = Math.floor(tobi);
	//System.out.println(tobi);
	}
	System.out.print("Binary: "+total);
	} 
}