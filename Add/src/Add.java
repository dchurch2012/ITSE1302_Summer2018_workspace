import java.util.Scanner;

/**
 * @author David Church
 * @version 1.0.0 Build 1 June 05, 2018. 
 *  <h1>Program Blank Description</h1><br>
 *
 *  Usage : java Blank
 *
 *  This program does???
 *
 *	ALGORITHM<br><br>
 *  <h2>BEGIN</h2>
 *  &nbsp;&nbsp;1. Step 1 -- Print 4 spaces folowed by a '*' followed by a carriage return<br>
 *  &nbsp;&nbsp;2. Step 2 -- Print 3 spaces folowed by 3 '*'s followed by a carriage return.<br>
 *  &nbsp;&nbsp;3. Step 3 -- Print 2 spaces folowed by 5 '*'s followed by a carriage return.<br>
 *  &nbsp;&nbsp;4. Step 4 -- Print 1 spaces folowed by 7 '*'s followed by a carriage return.<br>
 *  &nbsp;&nbsp;5. Step 5 -- Print 0 spaces folowed by 9 '*'s followed by a carriage return.<br>
 *  &nbsp;&nbsp;6. Step 6 -- Print 1 spaces folowed by 7 '*'s followed by a carriage return.<br>
 *  &nbsp;&nbsp;7. Step 7 -- Print 2 spaces folowed by 5 '*'s followed by a carriage return.<br>
 *  &nbsp;&nbsp;8. Step 8 -- Print 3 spaces folowed by 3 '*'s followed by a carriage return.<br>
 *  &nbsp;&nbsp;9. Step 9 -- Print 4 spaces folowed by a '*' followed by a carriage return<br>
 *  <h2>END</h2>
 */
public class Add {
	/** Description of main(String[] args)
	 * 
	 * @param args		String[] args
	 * This is the main routine required for ALL Java console programs
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		// Create a Scanner class to accept user input
		Scanner scan = new Scanner(System.in);
		
		//Prompt the user for a number
		System.out.println("Please enter a number");
		
		//get num1 from user
		num1 = scan.nextInt();
		
		//Prompt the user for another number
		System.out.println("Please enter another number");
		
		//get num2 from user
		num2 = scan.nextInt();
		
		//Add num1 and num2 and store in num3
		int num3 = add(num1, num2);
		
		//Print sum of num1 and num2
		System.out.println(num1 + " + " + num2 + " = " +  num3);
		
		scan.close();
	}
	
	/** Description of add(int number1, int number2)
	 * 
	 * @param number1	int	- First Number to add
	 * @param number2	int	- Second Number to add
	 * @return int 		sum of number1 and number2
	 * This method adds 2 numbers and returns the result
	 */
	public static int add(int number1, int number2) {
		return number1+number2;
	}

	public static int subtract(int number1, int number2) {
		return number1-number2;
	}

	public static int multiply(int number1, int number2) {
		return number1*number2;
	}

	public static int divide(int number1, int number2) {
		return number1/number2;
	}
}
