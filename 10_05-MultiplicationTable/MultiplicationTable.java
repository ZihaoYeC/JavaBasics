import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	int mult = scanner.nextInt();
	for(int i = 0; i <= 10;i++){
	if(i == 10){
	System.out.print(mult+" x "+i+" = "+(mult*i));		
	} else {
	System.out.println(mult+" x "+i+" = "+(mult*i));
	}
	}
	}
}