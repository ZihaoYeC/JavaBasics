import java.util.Scanner;

public class ClosestTo21{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int cardv = 0;
	int cardvt = 0;
	int totalp1 = 0;
	int totalp2 = 0;
	
	for(int n = 1; n <= 2;n++){
		if(n==2){
		System.out.println("");
		System.out.println("");	
		}
		System.out.println("PLAYER "+n);
		for(int i = 1;i<=3;i++){
			System.out.println("Enter the value of card "+i+" (1-12):");
			cardv = scanner.nextInt();
			while(cardv < 1||cardv > 12){
				System.out.println("Invalid card. Please enter a number between 1 and 12:");
				cardv = scanner.nextInt();		
			}
			cardvt += cardv;
		}
		System.out.println("Total for Player "+n+": "+cardvt);	
		if(cardvt > 21){
			System.out.println("Player "+n+" went over 21 and is eliminated!");		
		}
		if(n==1){
			totalp1 = cardvt;
			cardvt = 0;
		} else {
			totalp2 = cardvt;
		}
	}
	System.out.println("");
	System.out.println("");
	System.out.println("FINAL RESULTS");
	if(totalp1 > 21 && totalp2 > 21){
		System.out.print("Both players went over 21. No winner!");
	} else if((totalp1 <= 21 && totalp2 <= 21)&&totalp1 == totalp2){
		System.out.print("It is a draw! Both have "+totalp1+" points");
	} else if(totalp1 > 21){
		System.out.print("Player 2 wins");		
	} else if(totalp2 > 21){
		System.out.print("Player 1 wins");
	} else if(totalp1 > totalp2){
		System.out.print("Player 1 with "+totalp1+" points!");
	} else {
		System.out.print("Player 2 with "+totalp2+" points!");
	}
	} 
}