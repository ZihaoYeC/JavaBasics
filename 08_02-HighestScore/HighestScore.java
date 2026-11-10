import java.util.Scanner;

public class HighestScore{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the score of the first player:");	
		int play1 = scanner.nextInt();
		System.out.println("Enter the score of the second player:");	
		int play2 = scanner.nextInt();

		System.out.println("Enter the score of the third player:");	
		int play3 = scanner.nextInt();

		System.out.println("Enter the score of the fourth player:");	
		int play4 = scanner.nextInt();
		
		int mesGran = play1;
		if(play2 > mesGran) mesGran = play2;
	
		
		if(play3 > mesGran) mesGran = play3;
				
	
		if(play4 > mesGran) mesGran = play4;
		
		
		System.out.printf("The highest score is: %d%n", mesGran);
	}
}