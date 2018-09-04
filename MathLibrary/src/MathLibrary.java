import java.util.*;

public class MathLibrary {
	/** 1 FEET = 0.0003048 KM */
	final double KM_IN_FEET = 0.0003048;
	
	/** 1 KM = 3,280.83989501 FEET */
	final double FEET_IN_KM = 3280.83989501;
	
	/** ArrayList to store the factors of a number (integer) */
	protected ArrayList<Integer> factorList = new ArrayList<Integer>();
	
	/** 
	 * This method computes the area of a circle<br>
	 * Given : the radius of the circle<br>
	 * Using the equation Area = Pi * R^2<br>
	 * 
	 * @param radius	-	Radius of the circle
	 * @return double 	-	Circle Area
	 * 
	 */
	public double computeCircleArea(double radius) {
		double area = Math.PI * Math.pow(radius,2);
		return area;
	}
	
	/** 
	 * This method computes the cube root of a number<br>
	 * Given : the number<br>
	 * Returns : the number raised to the 1/3 power<br>
	 * 
	 * @param number	-	Number entered by user
	 * @return double 	-	number ^ (1/3)
	 * 
	 */
	public double computeCubeRoot(double number) {
		double root = Math.pow(number,(1.0/3.0));
		return root;
	}
	
	/** 
	 * Finds and returns all the factors of a number<br>
	 * Given : the number<br>
	 * Returns : An ArrayList of numbers that are the factors of the number<br>
	 * 
	 * @param number	-	Number entered by user
	 * @return List of all of the factors of the number.
	 * 
	 */
	public ArrayList<Integer> findAllFactors(int number){
	
		findDivisor(number);
		return factorList;
	}


	/** 
	 * Finds and returns all the factors of a number<br>
	 * Given : the number<br>
	 * Returns : An ArrayList of numbers that are the factors of the number<br>
	 * 
	 * @param number	-	Number entered by user
	 * @return the next factor of the number (called recursively to find ALL factors)
	 * 
	 */
	public int findDivisor(int number) {
		int result = 0; 
		
		for(int index = 2; index < number; index++) {
			if(number != index) {
				int remainder = number % index;
				result = number / index;
	
				if(remainder == 0) {
					factorList.add(index);
	
					if(isPrime(result)) {
						factorList.add(result);
					}
				
					result = findDivisor(result);
					
					if(isPrime(result)) {
						return result;
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Determines if the submitted number is Prime.<br>
	 * A number if Prime IF : It is Divisible only by itself and 1<br>
	 * Returns : true (IF Prime) or false (if NOT Prime)<br>
	 * If the number is divisible by 2 (And NOT = 2) the number CANNOT be prime<br>
	 * 
	 * @param number integer - Specified number<br>
	 * @return true or false<br>
	 */
	public boolean isPrime(int number) {
		boolean isPrime = true;
	
		if(number == 2) {
			return false;
		}
	
		for(int index = 2; index < number; index++) {
			int remainder = number  % index;
		
			if(remainder == 0) {
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;
	}

	/**
	 * Finds the largest of 2 numbers.<br>
	 * 
	 * @param a int - First Number<br>
	 * @param b int - Second Number<br>
	 * @return the larger of the 2 numbers<br>
	 * ALGORITHM<br>
	 * IF a .GE. b
	 * RETURN a
	 * ELSE
	 * RETURN b
	 */
	public int Min(int a, int b) {
		if(a >= b) {
			return a;
		}
		else {
			return b;
		}
	}


	/**
	 * Finds the Greatest Common Denominator of 2 numbers.<br>
	 * 
	 * @param a int - First Number<br>
	 * @param b int - Second Number<br>
	 * @return the greatest common divisor of positive numbers<br>
	 * ALGORITHM<br>
	 * See Euclidean Algorithm for Computing the GCD of a number
	 */
	public int greatestCommonDivisor(int a, int b)
	{
	   int n = Min (a, b);
	   int gcd = 1, i = 1;
	
	   while (i <= n) {
		  if (a % i == 0 && b % i == 0) {
			 gcd = i;
		  }
		  i++;
	   }
	   return gcd;
	}


	public ArrayList<Integer> GeneratePrimes(int intMax) {
		ArrayList<Integer> primeList = new ArrayList<Integer>();
	
		for(int index = 2; index <= intMax; index++) {
			if(isPrime(index)) {
				primeList.add(index);
			}
		}
		return primeList;
	}


	public double HourConvert(int hour,int minute,int second) {
		double hours = 0;

		//Convert to hours
		hours = hour + (double)(minute/60.0) + (double)(second / 3600.0);
		return hours;
	}
	
	public double KilometerConvert(double km) {
		double feet = FEET_IN_KM * km;
		
		return feet;
	}

	public List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
		    }
        }
        return factors;
	}
	
	
	/**
	 * Computes the Volume of a right square-base pyramid.<br>
	 * Given : the base and height of the pyramid<br>
	 * Returns : The volume of the pyramid<br>
	 * 
	 * @param altitude double = height (or altitude) of pyramid.<br>
	 * @param base double = length of one side of base<br>
	 * @return Volume = b*b*h / 3;<br>
	 */
	public double pyramidVolume(double altitude, double base) {
		double volume = 0;
		volume = base * base * altitude;
			
		return volume;
	}
	

	public Boolean TriangleCheck (double a, double b, double c) {
		boolean checks = true;
			
		//Check the sides using the Triangle inequality
		if((a + b) <= c) {
			checks = false;
		}
		
		//Check the sides using the Triangle inequality
		if((a + c) <= b) {
			checks = false;
		}
			
		if((b + c) <= a) {
			checks = false;
		}
		
		if(checks == true) {
			double area = TriangleArea(a,b,c);
		}
		return checks;
	}
		
	public double TriangleArea(double a, double b, double c) {
		double S = (a+b+c)/2;
		double area = Math.pow((S*(S-a)*(S-b)*(S-c)),.5);
		return area;
	}
	
	
	public double leastCommonMultiple(int a, int b) {
		/**
		 function gcd(a, b)
		   	while b ≠ 0
		       t := b; 
		       b := a mod b; 
		       a := t; 
    		return a;
		 */
		int t = 0;
		
		while(b != 0) {
			t = b;
			
			b = a % b;
			
			a = t;
		}
		return a;
	}

	
	// Recursive method to return gcd of a and b
	public int gcd(int a, int b) {
	    // Everything divides 0 
	    if (a == 0 || b == 0)
	       return 0;
	  
	    // base case
	    if (a == b)
	        return a;
	  
	    // a is greater
	    if (a > b) {
	        return gcd(a-b, b);
	    }
	    
	    return gcd(a, b-a);
	}
 
	// method to return LCM of two numbers
	public int lcm(int a, int b) {
	    return (a*b)/gcd(a, b);
	}

}




