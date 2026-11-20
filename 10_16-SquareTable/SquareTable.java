import java.util.Scanner;

public class SquareTable{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	String sal = "";
	int val = 0;
	do{
		System.out.println("Enter maximum value (2-100):");
		val = scanner.nextInt();		
	}while(!(val > 2 && val < 100));
	for(int i = 1; i <=val;i++){
		int y = i-1;
		sal = "";
		sal += i+"^2="+(i*i);
		if(y != 0) System.out.print(", ");
		System.out.print(sal);
	}


	//System.out.println("");
	//System.out.println("");
	} 
}