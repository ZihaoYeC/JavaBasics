public class Decimals {
	public static void main(String[] args){
		double x = 12.3456789;
		int n = 0;
		double Result = Math.round(x * Math.pow(10,n)) / Math.pow(10,n);
		System.out.println("Rounded to "+n+" decimals: "+Math.round(Result));
		n = 2;
		Result = Math.round(x * Math.pow(10,n)) / Math.pow(10.00,n);
		System.out.println("Rounded to "+n+" decimals: "+Result);
		n = 4;
		Result = Math.round(x * Math.pow(10,n)) / Math.pow(10.0000,n);
		System.out.println("Rounded to "+n+" decimals: "+Result);
		n = 6;
		Result = Math.round(x * Math.pow(10,n)) / Math.pow(10.000000,n);
		System.out.println("Rounded to "+n+" decimals: "+Result);
	}
}
	
	
	