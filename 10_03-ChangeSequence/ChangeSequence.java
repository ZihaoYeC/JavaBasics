import java.util.Scanner;

public class ChangeSequence{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the starting number:");
	int sta = scanner.nextInt();
	int end = sta-1;
	do {
	System.out.println("Enter the ending number:");
	end = scanner.nextInt();		
	}while(end <= sta);
	for(int i = sta; i <= end;i++) {
		int oth = i;
		if(i % 2==0){
		oth *=2;
		} else{
		oth /=2;	
		}
		System.out.print(oth+" ");
	}

	} 
}