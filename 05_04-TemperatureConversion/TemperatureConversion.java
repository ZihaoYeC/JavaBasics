import java.util.Scanner;

public class TemperatureConversion{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius:");
		double Cel = scanner.nextDouble();
		double CelToFah = (Cel*((double)9/5))+32;
		System.out.println("Fahrenheits = %.2f", CelToFah);
	}
}
