import java.util.Scanner;

public class ForClasseDAW1A{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter starting number:");
	int start = scanner.nextInt();
	System.out.println("Enter ending number:");
	int end = scanner.nextInt();

	while (start <= end) {
		System.out.println("Enter ending number:");
		end = scanner.nextInt();
		
	if(start > end){
		for (int i = start; i <= end; i++){ System.out.print(i + " ");
	}
	} else {
		for (int i = end; i >= start ; i--){ System.out.print(i + " ");
	} 
	
	/*for (int i = start; i <= ending; i++) {
		System.out.print(1+" "):
	}*/
	scanner.close();
			}
		}
	}
}