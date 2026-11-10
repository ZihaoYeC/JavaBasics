import java.util.Scanner;

public class CovidTest{
	public static void main(String[] arg) {
	Scanner scanner = new Scanner(System.in);	
	System.out.println("Tens febre? (sí/no):");
		String sfebre = scanner.nextLine();
	System.out.println("També tens tos? (sí/no):");
		String stos = scanner.nextLine();
	System.out.println("Et sents cansat o dèbil? (sí/no):");
		String scansat = scanner.nextLine();
	System.out.println("Tens dificultat per respirar? (sí/no):");
		String sdrespira = scanner.nextLine();
	System.out.println("Tens mal de coll o mal de cap? (sí/no):");
		String smalcoll = scanner.nextLine();
	System.out.println("Has perdut l'olfacte o el gust? (sí/no):");
		String sperdgust = scanner.nextLine();
	System.out.println("Tens congestió nasal o mocs? (sí/no):");
		String sconmocs = scanner.nextLine();

	boolean febre = sfebre.equalsIgnoreCase("si");
	boolean tos = stos.equalsIgnoreCase("si");
	boolean drespira = sdrespira.equalsIgnoreCase("si");
	boolean cansat = scansat.equalsIgnoreCase("si");	
	boolean malcoll = smalcoll.equalsIgnoreCase("si");	
	boolean perdgust = sperdgust.equalsIgnoreCase("si");	
	boolean conmocs = sconmocs.equalsIgnoreCase("si");

	boolean covid = false;
		

	
	if(febre){
		if(tos){
			if(cansat||(!cansat||drespira)){
			covid = true; }
		} else if(malcoll){
			covid = true;
		}
	} else {
		if(perdgust){
			covid = true;
		} else if(conmocs){
		covid = true;
		}
	}
	if(covid){
		System.out.print("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
	} else {
	System.out.print("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
	}
	} 
}