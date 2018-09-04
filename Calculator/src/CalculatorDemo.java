import java.util.Scanner;

public class CalculatorDemo {
	/** Description of main(String[] args)
	 * 
	 * @param args		String[] args
	 * This is the main routine required for ALL Java console programs
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator(45,"Hello World");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("                 Java Calculator");
		System.out.println("-------------------------------------------------------");
		System.out.println("1. Enter '1' For Addition");
		System.out.println("2. Enter '2' For Subtraction");
		System.out.println("3. Enter '3' For Multiplication");
		System.out.println("4. Enter '4' For Division");
		System.out.println("5. Enter '5' For MODULE Division");
		System.out.println("6. Enter '6' For Quotient with Remainder");
		System.out.println("-------------------------------------------------------");
		
		int choice = scan.nextInt();
		
		switch(choice) {
			//ADD
			case 1:
				addDemo(calc,scan);
				break;
			
			//SUBTRACT
			case 2:
				subtractDemo(calc,scan);
				break;
				
			//MULTIPLY
			case 3:
				multiplyDemo(calc,scan);
				break;
				
			//DIVISION
			case 4:
				divisionDemo(calc, scan);
				break;
			
			//MODULO Demo
			case 5:
				moduloDemo(calc, scan);
				break;

			//Quotient with Remainder
			case 6:
				divisionRemainder(calc,scan);
				break;
				
			default:
				break;
		}
		
		scan.close();

	}
	
	public static void addDemo(Calculator calc, Scanner scan) {
		//Demonstrate calculator class
		double num1 = 0;
		double num2 = 0;
		
		//Prompt the user for a number
		System.out.println("Please enter a number");
		
		//get num1 from user
		num1 = scan.nextDouble();
		
		//Prompt the user for another number
		System.out.println("Please enter another number");
		
		//get num2 from user
		num2 = scan.nextDouble();
		
		//Add num1 and num2 and store in num3
		double num3 = calc.add(num1, num2);
		
		//Print sum of num1 and num2
		System.out.println(num1 + " + " + num2 + " = " +  num3);
	}
	
	public static void subtractDemo(Calculator calc, Scanner scan) {
		//Demonstrate calculator class
		double num1 = 0;
		double num2 = 0;
		
		//Prompt the user for a number
		System.out.println("Please enter a number");
		
		//get num1 from user
		num1 = scan.nextDouble();
		
		//Prompt the user for another number
		System.out.println("Please enter another number");
		
		//get num2 from user
		num2 = scan.nextDouble();
		
		//Add num1 and num2 and store in num3
		double num3 = calc.subtract(num1, num2);
		
		//Print sum of num1 and num2
		System.out.println(num1 + " - " + num2 + " = " +  num3);
	}
	
	public static void multiplyDemo(Calculator calc, Scanner scan) {
		//Demonstrate calculator class
		double num1 = 0;
		double num2 = 0;
		
		//Prompt the user for a number
		System.out.println("Please enter a number");
		
		//get num1 from user
		num1 = scan.nextDouble();
		
		//Prompt the user for another number
		System.out.println("Please enter another number");
		
		//get num2 from user
		num2 = scan.nextDouble();
		
		//Add num1 and num2 and store in num3
		double num3 = calc.multiply(num1, num2);
		
		//Print sum of num1 and num2
		System.out.println(num1 + " * " + num2 + " = " +  num3);
	}

	public static void divisionDemo(Calculator calc, Scanner scan) {
		//Demonstrate calculator class
		double num1 = 0;
		double num2 = 0;
		
		//Prompt the user for a number
		System.out.println("Please enter a number");
		
		//get num1 from user
		num1 = scan.nextDouble();
		
		//Prompt the user for another number
		System.out.println("Please enter another number");
		
		//get num2 from user
		num2 = scan.nextDouble();
		
		//Divide num1 by num2 and store in num3
		double num3 = calc.divide(num1, num2);
		
		//Print sum of num1 and num2
		System.out.println(num1 + " / " + num2 + " = " +  num3);
	}

	public static void divisionRemainder(Calculator calc, Scanner scan) {
		//Demonstrate calculator class
		int num1 = 0;
		int num2 = 0;
		
		//Prompt the user for a number
		System.out.println("Please enter a number");
		
		//get num1 from user
		num1 = scan.nextInt();
		
		//Prompt the user for another number
		System.out.println("Please enter a divisor for previous number");
		
		//get num2 from user
		num2 = scan.nextInt();
		
		//Add num1 and num2 and store in num3
		ModuloMath modMath = calc.elemDivision(num1, num2);
		
		//Print num1 Division and Remainder
		System.out.println(num1 + " Divided by " + num2 + " = " +  modMath.getNumber() + " with a remainder of " + modMath.getDivisor());
	}
	
	public static void moduloDemo(Calculator calc, Scanner scan) {
		//Demonstrate calculator class
		int num1 = 0;
		int num2 = 0;
		
		//Prompt the user for a number
		System.out.println("Please enter a number");
		
		//get num1 from user
		num1 = scan.nextInt();
		
		//Prompt the user for another number
		System.out.println("Please enter a divisor for previous number");
		
		//get num2 from user
		num2 = scan.nextInt();
			
		//Add num1 and num2 and store in num3
		int num3 = calc.modulo(num1, num2);
		
		//Print num1 MODULO num2
		System.out.println(num1 + " % " + num2 + " = " +  num3);
	}
	
	public double ConvertDemo(double inches) {
		UnitConverter unitConvert = new UnitConverter();
		double feet = unitConvert.convertInchesToCentimeters(inches);
		
		return feet;
	}
}



