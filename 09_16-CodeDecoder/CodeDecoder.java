import java.util.Scanner;

public class CodeDecoder{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);
	int code = 0;
	String deocde = "";
	
	while(code <= 0){
	System.out.println("Enter secret code > 0:");
	code = scanner.nextInt();
	}
	
	while(code != 0){
		int kiula = code % 10;
		code /= 10;
	switch(kiula){
		case 1 -> deocde = "I"+deocde;
		case 2 -> deocde = "Z"+deocde;
		case 3 -> deocde = "E"+deocde;
		case 4 -> deocde = "A"+deocde;
		case 5 -> deocde = "S"+deocde;
		case 6 -> deocde = "G"+deocde;
		case 7 -> deocde = "T"+deocde;
		case 8 -> deocde = "B"+deocde;
		case 9 -> deocde = "P"+deocde;
		case 0 -> deocde = "O"+deocde;
	}
	}
	System.out.print("Decoded message:"+deocde);

	} 
}