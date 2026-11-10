import java.util.Scanner;

public class PizzaCalculator{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the diameter of the first pizza (cm):");
			int p1 = scanner.nextInt();
		System.out.println("Enter the diameter of the first pizza (cm):");
			int p2 = scanner.nextInt();
		System.out.println("Enter the diameter of the first pizza (cm):");
			int p3 = scanner.nextInt();
	if(p1 == p2 && p2 == p3) {
		System.out.println("All pizzas have the same size");
	} else if(p1 == p2 || p2 == p3 || p1 == p3) {
		System.out.println("Two pizzas have the same size");
	} else {
	System.out.println("All pizzas have different sizes");
	}	
	}
}