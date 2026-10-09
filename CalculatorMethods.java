
import java.util.Scanner;

public class CalculatorMethods {
		
	//create a scanner object
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		int choice = 0;

	do { 
		System.out.println("\n===== Calculator =====");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		System.out.println();
		System.out.print("Enter choice: ");

		choice = input.nextInt();

		if (choice >= 1 && choice <= 4) {
			System.out.println();
			System.out.print("Enter first number: ");
			double a = input.nextDouble();
			System.out.print("Enter second number: ");
			double b = input.nextDouble();
			System.out.println();

		if (choice == 1) {
			System.out.println("Result: " + add(a, b));
		} else if (choice == 2) {
			System.out.println("Result: " + subtract(a, b));
		} else if (choice == 3) {
			System.out.println("Result: " + multiply(a, b));
		} else {
			if (b == 0) {
				System.out.println("Cannot divide by zero.");
		} else {
			System.out.println("Result: " + divide(a, b));
		}
	}
	System.out.println();
}
	} while (choice !=5);

	input.close();	

	}
		public static double add(double a, double b) {
		return a + b;
	}
	public static double subtract(double a, double b) {
		return a - b;
	}
	public static double multiply(double a, double b) {
		return a * b;
	}
	public static double divide(double a, double b) {
		return a / b;
	}
}
		

	
	






