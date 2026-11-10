import java.util.Scanner;

public class BlackFriday{
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the price");
			double price = scanner.nextDouble();
		System.out.println("Do you have a loyalty card? (yes/no):");
			String yesno = scanner.next();
			double finalprice = 0;
		if(yesno.equalsIgnoreCase("yes")) {
			if(price > 60) {
			finalprice = price-((price*20.00)/100);
				System.out.printf("Final price: %.2f €", finalprice);
			} else if(price <= 60){
			finalprice =price-((price*5.00)/100);
				System.out.printf("Final price: %.2f €", finalprice);
			}
		} else if(yesno.equalsIgnoreCase("no")) {
			if(price > 60) {
			finalprice = price-((price*10.00)/100);
				System.out.printf("Final price: %.2f €", finalprice);			
			} else {
			finalprice = price;
			System.out.printf("Final price: %.2f €", finalprice);			
			}
		}
	}
}