import java.util.Scanner;

public class FoodTruck{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your choice (burger/tacos/pizza):");
	String choice = scanner.nextLine();
	double foodPrize = 0;
	double acom = 0;
	double begu = 0;
	double total = 0;
	int eror = 0;
	switch (choice.toLowerCase()){
		case "burger":
			foodPrize = 10.50;
			System.out.println("Fries size? (large/small):");
			String size = scanner.nextLine();
			if(size.equalsIgnoreCase("large")) 
				acom = 4.50;
			else if(size.equalsIgnoreCase("small")) 
				acom = 3.75;
			else eror++;
			break;
		case "tacos":
			foodPrize = 8.50;
			System.out.println("Sauce? (cheese/guacamole):");
			String sauce = scanner.nextLine();
			if(sauce.equalsIgnoreCase("cheese")) 
				acom = 2.50;
			else if(sauce.equalsIgnoreCase("guacamole")) 
				acom = 2.60;
			else eror++;
			break;
		case "pizza":
			foodPrize = 12.50;
			System.out.println("Topping? (pepperoni/carbonara):");
			String toping = scanner.nextLine();
			if(toping.equalsIgnoreCase("pepperoni")) 
				acom = 3.50;
			else if(toping.equalsIgnoreCase("carbonara")) 
				acom = 3.30;
			else eror++;
			break;
		default :
			eror++;
	}
	if(eror>0) System.out.print("Invalid choice");
	else {
		System.out.println("Choose your drink (soft/beer/water):");
		String drink = scanner.nextLine();
		switch (drink.toLowerCase()){
		case "soft":
			begu = 3.50;
			break;
		case "beer":
			begu = 5.50;
			break;
		case "water":
			begu = 2.20;
			break;
		default:
			eror++;
		}
		if(eror==1) System.out.print("Invalid choice");
		else {total = foodPrize+begu+acom;
		System.out.printf("Total: %.2f €", total);
		}
	}
	}	
}