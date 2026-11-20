import java.util.Scanner;

public class TotalSumOfCards{
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
		for(int i = 1;i<=4;i++){
		System.out.println("Enter the value of card "+i+" for player "+n+":");
		cardv = scanner.nextInt();
		while(cardv < 1||cardv > 12){
		System.out.println("Wrong card, please enter 1..12:");
		cardv = scanner.nextInt();		
		}
		cardvt += cardv;
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
	System.out.println("RESULTS");
	System.out.println("Total cards Player 1: "+totalp1);
	System.out.println("Total cards Player 2: "+totalp2);
	if(totalp1 == totalp2){
		System.out.print("It is a draw.");
	} else if(totalp1 > totalp2){
		System.out.print("Player 1 has won!");
	} else {
		System.out.print("Player 2 has won!");
	}
	} 
}