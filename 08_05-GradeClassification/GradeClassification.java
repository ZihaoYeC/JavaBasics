import java.util.Scanner;

public class GradeClassification {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numeric grade (0-100):");
		int grade = scanner.nextInt();
		int Zor = 0;
		if(grade >= 90 && grade <= 100) {
			Zor = 1;
		} else if(grade >= 70 && grade <= 89) { 
		Zor = 2; 
		} else if(grade >= 60 && grade <= 69) {
		Zor = 3;
		} else if(grade >= 50 && grade <= 59) {
		Zor = 4; 
		} else if(grade >= 0 && grade <= 49) { 
		Zor = 5;
		}
		

		switch(Zor){
		case 1:
			System.out.println("A = Excellent");
			break;
		case 2:
			System.out.println("B = Good");
			break;
		case 3:
			System.out.println("C = Satisfactory");
			break;
		case 4:
			System.out.println("D = Pass");
			break;
		case 5:
			System.out.println("F = Fail");
			break;
		default:
			System.out.println("Invalid grade");
			break;
		}				
	}
}