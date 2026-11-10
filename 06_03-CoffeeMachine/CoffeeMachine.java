import java.util.Scanner;

public class CoffeeMachine{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Monthly electricity cost:");
		double electricost = scanner.nextDouble();
	
	System.out.println("Monthly coffee machine rental cost:");
		double rentalcost = scanner.nextDouble();
	
	System.out.println("Number of coffees:");
		double numbercofe = scanner.nextDouble();
		
	System.out.println("Average coffee price:");
		double avercofeprice = scanner.nextDouble();
		
	System.out.println("Coffee price per kilo:");
		double kcofeprice = scanner.nextDouble();

	System.out.println("Kilograms of coffee:");
		double kcofe = scanner.nextDouble();
	
	System.out.println("Milk price per litre:");
		double milkpricel = scanner.nextDouble();

	System.out.println("Liters of milk:");
		double lmilk = scanner.nextDouble();
	double cost = electricost+rentalcost+(kcofeprice*kcofe)+(milkpricel*lmilk);
	double ganan = numbercofe*avercofeprice;

	boolean bole = (cost < ganan) ? true:false;
	System.out.printf("Should we buy the coffee machine? %b%n", bole);



	}
}