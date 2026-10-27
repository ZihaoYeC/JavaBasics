import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter radius:");
	double radius = scanner.nextDouble();
	System.out.println("Enter units:");
	String units = scanner.next();
	System.out.println("Area = "+(Math.PI*(radius*radius))+" "+units+"^2");
	}
}