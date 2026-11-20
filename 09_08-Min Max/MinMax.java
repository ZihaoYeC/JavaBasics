import java.util.Scanner;

public class MinMax {
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	double dun1 = 0;
	double est = 0;
	double min = 0;
	int post = 0;
	do{
	System.out.println("Enter a positive double (negative number to finish):");
	dun1 = scanner.nextDouble();
	if((est == 0 && min == 0)&& dun1 >= 0) {
		est = dun1;
		min = dun1;
		post++;
	}
	if(dun1 > est) {
		est = dun1;
	}
	if(dun1 < min && dun1 > 0) {
		min = dun1;
	}
	} while(dun1 >= 0);
	if(post == 0) {
	System.out.print("No positive numbers were entered");
	} else {
	System.out.println("MINIM = "+min);
	System.out.print("MAXIM = "+est);
	}
	} 
}