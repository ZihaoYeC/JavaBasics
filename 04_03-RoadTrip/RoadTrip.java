public class RoadTrip {
	public static void main(String[] args){
		double distancia = 347.8;
		double consum = 6.7/100;
		double gasolina = 1.92;
		int passatgers = 4;
		double peatges = 12.65;
		int menjar = 30;
		int menjartor = 30;
		double aparcament = 18.5;
		
		double distanciatotal = distancia*2;
		double combustible = distanciatotal*consum;
		double costcombust = combustible*gasolina;
		double preupeatges = peatges*2;
		double parking = aparcament;
		double menjartotal = menjar+menjartor;
		int persones = passatgers;
		double costtotal = costcombust+preupeatges+parking+menjartotal;
		double costperpers = costtotal/persones;
		
		System.out.printf("=========== ROAD TRIP ===========%n");
		System.out.printf("%-20s %10.2f km%n","Round trip distance:", distanciatotal);
		System.out.printf("---------------------------------%n");
		System.out.printf("%-20s %10.2f L%n","Fuel needed:" ,combustible);
		System.out.printf("%-20s %10.2f €%n","Fuel cost:" ,costcombust);
		System.out.printf("---------------------------------%n");
		System.out.printf("%-20s %10.2f €%n","Trolls:" ,preupeatges);
		System.out.printf("%-20s %10.2f €%n","Parking price:" ,parking);
		System.out.printf("%-20s %10.2f €%n","Food:", menjartotal);
		System.out.printf("---------------------------------%n");
		System.out.printf("%-20s %10.2f €%n","Total trip cost:" ,costtotal);
		System.out.printf("%-20s %10d %n", "Passengers" ,persones);
		System.out.printf("%-20s %10.2f €%n","Cost per passenger:" ,costperpers);
		System.out.printf("=================================");
	}
}