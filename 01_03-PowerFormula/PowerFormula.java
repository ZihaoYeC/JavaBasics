public class PowerFormula {

	public static void main(String[] args) {
		int force = 125;
		int distance = 37;
		int time = 12;
	
		double power = (double)(force*distance)/time;
		System.out.println("Power = "+power+" W" );		 
	}
}