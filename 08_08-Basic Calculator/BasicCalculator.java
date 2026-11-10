import java.util.Scanner;

public class BasicCalculator{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int num1 = scanner.nextInt();
		System.out.println("Enter an operator (+, -, *, /, %):");
		String oper = scanner.next();
		System.out.println("Enter the second integer:");
		int num2 = scanner.nextInt();
		String[] valid = {"+", "-", "*", "/", "%"};
		if(!java.util.Arrays.asList(valid).contains(oper)){
			System.out.println("Invalid operator!");

		} else if((oper.equals("/")||oper.equals("%"))&& num2 == 0) {
		System.out.println("Error: Division by zero is not allowed");			
		} else if(oper.equals("+")) {
		System.out.println(num1+" + "+num2+" = "+(num1+num2));

		} else if(oper.equals("-")) {
		System.out.println(num1+" - "+num2+" = "+(num1-num2));			
		} else if(oper.equals("*")) {
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
			
		} else if(oper.equals("/")) {
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
			
		} else if(oper.equals("%")) {
		System.out.println(num1+" % "+num2+" = "+(num1%num2));
			
	}	
	}
}