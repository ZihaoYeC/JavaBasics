import java.util.Scanner;

public class TextSearch{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int exa = 0;
	int ignoca = 0;
	System.out.println("How many texts?");
	int many = scanner.nextInt();
	System.out.println("Word to search for:");
	String sear = scanner.next();
	for(int i = 1; i <= many; i++){
	System.out.println("Enter text"+i+":");
	String give = scanner.next();
		if(give.equals(sear)){
			exa++;
		} else if(give.equalsIgnoreCase(sear)){
			ignoca++;
		}
	}
	System.out.println("Exact matches: "+exa);
	System.out.print("Matches ignoring case: "+ignoca);

	} 
}