import java.util.Scanner;

public class GuessNumberWhile{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	boolean ever = true;
	int secre = 52;
	int atem = 0;
	while(ever){
	System.out.println("Enter a number between 1 and 100:");
	int guess = scanner.nextInt();
	atem++;
	if(guess == secre){
		ever = false;
	} else if(guess < 1){
		System.out.println("At least 1!");
	} else if(guess < secre){
		System.out.println("It's greater than "+guess);
	} else if(guess > 100){
		System.out.println("At most 100!");
	} else if(guess > secre){
		System.out.println("It's smaller than "+guess);
	}
	
	}
	System.out.println("You guessed it!");
	System.out.print("Attempts: "+atem);


	} 
}