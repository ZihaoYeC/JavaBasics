import java.util.Scanner;

public class SplitPositiveNegative{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	String pos = " ";
	String neg = " ";
	int sert = 0;
	for(int i = 1;i<=10;i++){
	System.out.printf("Enter a number [%d]:\n", i);
	sert = scanner.nextInt();
	if(sert >= 0){
	pos += sert+" ";
	} else {
	neg += sert+" ";
	}
	}
	System.out.println("Positive or zero: "+pos);
	System.out.print("Negative: "+neg);
	} 
}