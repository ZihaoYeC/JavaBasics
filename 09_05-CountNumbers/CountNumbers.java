import java.util.Scanner;

public class CountNumbers{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number between 0 and 9. Enter -1 to finish:");
	int nintro;
	int t0 = 0;
	int t1 = 0;
	int t2 = 0;
	int t3 = 0;
	int t4 = 0;
	int t5 = 0;
	int t6 = 0;
	int t7 = 0;
	int t8 = 0;
	int t9 = 0;

	do{
		nintro = scanner.nextInt();
		if(nintro >= 10) System.out.println("Invalid number, enter between 0 and 9 or -1 to finish.");
		switch(nintro) {
		case 0:
		t0++;
		break;
		case 1:
		t1++;
		break;
		case 2:
		t2++;
		break;
		case 3:
		t3++;
		break;
		case 4:
		t4++;
		break;
		case 5:
		t5++;
		break;
		case 6:
		t6++;
		break;
		case 7:
		t7++;
		break;
		case 8:
		t8++;
		break;
		case 9:
		t9++;
		break;
		}
	} while(nintro != -1);
	System.out.println("Total 0: "+t0);
	System.out.println("Total 1: "+t1);
	System.out.println("Total 2: "+t2);
	System.out.println("Total 3: "+t3);
	System.out.println("Total 4: "+t4);
	System.out.println("Total 5: "+t5);
	System.out.println("Total 6: "+t6);
	System.out.println("Total 7: "+t7);
	System.out.println("Total 8: "+t8);
	System.out.print("Total 9: "+t9);
	} 
}