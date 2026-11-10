import java.util.Scanner;

public class NutritionCalculator {
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);	
	System.out.println("Nutrition calculator:");	
	System.out.println("1. Calculate calories");	
	System.out.println("2. Calories per serving");	
	System.out.println("3. Daily calories");	
	System.out.println("Choose an option:");

		int chosed = scanner.nextInt();
	switch (chosed){
		case 1:
		System.out.println("Enter protein (g):");
		double protein = scanner.nextDouble();
		System.out.println("Enter carbohydrates (g):");
		double carbohydrates = scanner.nextDouble();
		System.out.println("Enter fat (g):");
		double fat = scanner.nextDouble();
		double tcal = (protein*4)+(carbohydrates*4)+(fat*9);
		System.out.printf("Total calories: %.2f kcal", tcal);
		break;
		case 2:
		System.out.println("Enter calories per 100 g:");
		double calories100g = scanner.nextDouble();
		System.out.println("Enter serving size (g):");
		double servingsize = scanner.nextDouble();
		double tcalperser = (calories100g*servingsize)/100;
		System.out.printf("Calories per serving: %.2f kcal", tcalperser);
		break;
		case 3:
		System.out.println("Enter age (years):");
		int years = scanner.nextInt();
		System.out.println("Enter height (cm):");
		double height = scanner.nextDouble();
		System.out.println("Enter weight (kg):");
		double weight = scanner.nextDouble();
		System.out.println("Enter sex (M/F):");
		char sex = scanner.next().charAt(0);
		System.out.println("Enter activity factor (1.2 to 1.9):");
		double actfac = scanner.nextDouble();
			switch (sex){
			case 'M':
				tcal = (((10*weight)+(6.25*height)-(5*years)+5)*actfac);
				System.out.printf("Daily calories: %.2f kcal", tcal);
			break;
			case 'F':
				tcal = (((10*weight)+(6.25*height)-(5*years)-161)*actfac);
				System.out.printf("Daily calories: %.2f kcal", tcal);
			break;

	}}
	}
			
	//System.out.println("");	
 
}