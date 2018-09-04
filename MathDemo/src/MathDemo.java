

import java.util.Scanner;

public class MathDemo {
	public static void main(String[] args) {
		MathLibrary mathLib = new MathLibrary();
		double lcm = mathLib.leastCommonMultiple(12,15);
		
		System.out.println("The LCM of 12 and 15 is : " + lcm);
		
		double gcm = mathLib.greatestCommonDivisor(12, 15);
		System.out.println("The GCD of 12 and 15 is : " + gcm);
		
		int a = 15, b = 20;
		System.out.println("LCM of " + a +" and " + b + " is " + mathLib.lcm(a, b));

		a = 27;
		b = 33;
		System.out.println("LCM of " + a +" and " + b + " is " + mathLib.lcm(a, b));
}
}

