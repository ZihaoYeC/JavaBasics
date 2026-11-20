import java.util.Scanner;

public class IncreasingSequence{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int numerin;
	String sec = "";
	int numerin2 = 0;
	do{
	System.out.println("Enter number:");
	numerin = scanner.nextInt();
	if(numerin2 >= numerin){
		break;
	} else {
	sec += numerin+" ";
	numerin2 = numerin;
	}
	} while(true);
	System.out.print("Sequence: "+sec);
	} 
}