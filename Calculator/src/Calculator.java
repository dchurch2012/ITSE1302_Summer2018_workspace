
public class Calculator {
	double myNumber1 = 0;
	String greeting = "";

	public Calculator() {
		myNumber1 = 0;
		greeting = "";
	}
	
	public Calculator(double myNumber1, String greeting) {
		this.myNumber1 = myNumber1;
		this.greeting = greeting;
	
		//System.out.println("myNumber1 is : " + this.myNumber1);
		
		//System.out.println("greeting is : " + this.greeting);
		
	}
	
	/** Description of add(double number1, double number2)
	 * 
	 * @param number1	double	- First Number to add
	 * @param number2	double	- Second Number to add
	 * @return double 		sum of number1 and number2
	 * This method adds 2 numbers and returns the result
	 */
	public double add(double number1, double number2) {
		System.out.println(myNumber1);
		return number1+number2;
	}

	/** Description of subtract(double number1, double number2)
	 * 
	 * @param number1	double	- First Number to add
	 * @param number2	double	- Second Number to add
	 * @return double 		subtracts number2 from number1
	 * This method returns the difference between 2 numbers
	 */
	public double subtract(double number1, double number2) {
		return number1-number2;
	}

	/** Description of multiply(double number1, double number2)
	 * 
	 * @param number1	double	- First Number to add
	 * @param number2	double	- Second Number to add
	 * @return double 		multiply number1 and number1
	 * This method returns the product of number1 and number2
	 */
	public double multiply(double number1, double number2) {
		return number1*number2;
	}

	/** Description of divide(double number1, double number2)
	 * 
	 * @param number1	double	- First Number
	 * @param number2	double	- Second Number
	 * @return double 		divide number1 by number2
	 * This method returns the quotient of number1 and number2
	 */
	public double divide(double number1, double number2) {
		return number1/number2;
	}
	
	/** Description of modulo(double number1, double number2)
	 * 
	 * @param number	double	- First Number
	 * @param divisor	double	- Divisor
	 * @return double 		number1 MODULO number2 (remainder of number1/number2)
	 * This method returns the remainder of number1 / number2
	 */
	public int modulo(int number, int divisor) {
		return number % divisor;
	}
	
	/** Description of elemDivision(double number1, double number2)
	 * 
	 * @param number	double	- First Number
	 * @param divisor	double	- Divisor
	 * @return ModuloMath number1 MODULO number2 (remainder of number1/number2)
	 * ALGORITHM<br>
	 * 1. Compute number / divisor and store in result<br>
	 * 2. Compute number % divisor and store in remainder<br>
	 * 3. Create a new ModuleMath class initializing it with result and divisor<br>
	 * 4. Return the ModuleMath instance created in (3).<br>
	 */
	public ModuloMath elemDivision(int number, int divisor) {
		int result = number / divisor;
		int remainder = number % divisor;
		
		ModuloMath moduloMath = new ModuloMath(result,remainder);
		
		return moduloMath;
		
	}
}


