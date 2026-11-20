import java.util.Scanner;

public class SumToN{
	public static void main(String[] arg){
	Scanner scanner = new Scanner(System.in);
	int serc = 0;
	int i = 1;
	int total = 0;
	while(serc <= 1){
	System.out.println("Enter a number (greater than 1):");
	serc = scanner.nextInt();
	}
	for(i = 1;i <= serc;i++){
		total+=i;
	}
	System.out.print("Sum = "+total);		
	}
}