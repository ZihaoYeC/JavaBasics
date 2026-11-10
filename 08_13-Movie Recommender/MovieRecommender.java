import java.util.Scanner;

public class MovieRecommender{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Movie Recommender!");
		System.out.println("Do you like action movies? (yes/no):");
		String enter1 = scanner.nextLine();	
		if(enter1.equalsIgnoreCase("yes")){
			System.out.println("Do you prefer superhero or spy movies? (superhero/spy/other):");
			String enter2A = scanner.nextLine();
			//2A
			if(enter2A.equalsIgnoreCase("superhero")) {
			System.out.println("You should watch 'Avengers: Endgame'");
			} else if(enter2A.equalsIgnoreCase("spy")) {
			System.out.println("You should watch 'Mission: Impossible Fallout'");
			} else if(enter2A.equalsIgnoreCase("other")) {
			System.out.println("You should watch 'Mad Max: Fury Road'");
			}
		} else if(enter1.equalsIgnoreCase("no")) {
			//2B
			System.out.println("Do you like comedies? (yes/no):");
			String enter2B = scanner.nextLine();
				//3A
					if(enter2B.equalsIgnoreCase("yes")) {
			System.out.println("Do you prefer smart humor or silly humor? (smart/silly/other):");
				String enter3A = scanner.nextLine();
					if(enter3A.equalsIgnoreCase("smart")) {
					System.out.println("You should watch 'The Grand Budapest Hotel'");
					} else if(enter3A.equalsIgnoreCase("silly")) {
					System.out.println("You should watch 'The Hangover'");
					} else if(enter3A.equalsIgnoreCase("other")) {
					System.out.println("You should watch 'The Mask'");
					}
				} else if(enter2B.equalsIgnoreCase("no")){
				//3B
				System.out.println("Do you like independent films? (yes/no):");
			String enter3B = scanner.nextLine();
				if(enter3B.equalsIgnoreCase("no")) {
				System.out.println("You should watch 'Home Alone'");
				} else if(enter3B.equalsIgnoreCase("yes")) {
					//4A
				System.out.println("Do you prefer drama or experimental style? (drama/experimental/other):");
			String enter4A = scanner.nextLine();
					if(enter4A.equalsIgnoreCase("drama")) {
					System.out.println("You should watch 'Lady Bird'");
					} else if(enter4A.equalsIgnoreCase("experimental")) {
					System.out.println("You should watch 'Everything Is Illuminated'");
					} else if(enter4A.equalsIgnoreCase("other")) {
					System.out.println("You should watch 'Moonlight'");
					}
		
				}
		}
	}
		System.out.print("Thanks for using the Movie Recommender!");		
}
}