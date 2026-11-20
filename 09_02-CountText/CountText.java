import java.util.Scanner;

public class CountText {
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter text to find:");
	String findtext = scanner.nextLine();
	int ten = 0;
	int coincid = 0;
	while(ten < 10){
	ten++;
	System.out.println("Enter text ("+ten+"):");
	String textinsert = scanner.nextLine();
	if(textinsert.equalsIgnoreCase(findtext)){
		coincid++;
	}
	}
	System.out.println("Count: "+coincid);
	} 
}