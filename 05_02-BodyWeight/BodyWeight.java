import java.util.Scanner;
public class BodyWeight {

    public static void main(String[] args) {

        // Constants
        final byte K_MEN = 4;
        final float K_WOMEN = 2.5f;

        // Create the Scanner
		Scanner scanner = new Scanner(System.in);

        // Request the input  (2 integers)
		System.out.println("Enter your height in cm:");
		int H = scanner.nextInt();
		System.out.println("Enter your age:");
		int age = scanner.nextInt();

        // Calculate the body weight for men
		double wm = H-100.00 -((H-150.00)/4.00)+((age-20.00)/4.00);

        // Display the body weight for men
		System.out.println("Ideal Body Weight for Men = "+wm+" kg");
        // Calculate the body weight for women
		double wf = H-100.00 -((H-150.00)/4.00)+((age-20.00)/2.50);
        // Display the body weight for women
		System.out.println("Ideal Body Weight for Women = "+wf+" kg");
        // Close the Scanner
		scanner.close();

    }

}