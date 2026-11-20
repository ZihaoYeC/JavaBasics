import java.util.Scanner;

public class ZombieDetector{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter body temperature:");
	double temp = scanner.nextDouble();
	 System.out.print((temp>30) ? "Zombie detected!":"Human detected!");
	//System.out.println("Zombie detected!");
	//System.out.println("Human detected!");

	} 
}