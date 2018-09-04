/*
 * 	Converts Degrees to radians
 *
 *	Converts radians to degrees
 *	
 *	Converts centimeters to inches
 *	
 *	Converts feet to inches
 *	
 *	Converts inches to centimeters
 *	
 *	Converts feet to miles
 *	
 *	Converts inches to miles
 *	
 *	Converts miles to inches
 *	
 *	Converts centimeters to miles
 *	
 *	Converts feet to yards
 */
public class UnitConverter {
	final double DEGREES_TO_RADIANS = 360.0 / 2*Math.PI;
	final double INCHES_TO_CM = 2.54;
	final double FEET_TO_INCHES = 12;
	final double STATUTE_MILES_TO_FEET = 5280;
	final double YARDS_TO_FEET = 3;
	
	public double convertDegreesToRadians(double degrees) {
		return degrees / DEGREES_TO_RADIANS;
	}

	public double convertRadiansToDegrees(double radians) {
		return radians * DEGREES_TO_RADIANS;
	}
	
	public double convertInchesToCentimeters(double inches) {
		return inches * INCHES_TO_CM;
	}
	
	public double convertCentimetersToInches(double cm) {
		return cm / INCHES_TO_CM;
	}
	
	public double convertInchesToFeet(double inches) {
		return inches / FEET_TO_INCHES;
	}
	
	public double convertFeetToInches(double feet) {
		return feet * FEET_TO_INCHES;
	}
	
	public double convertFeetToMiles(double feet) {
		return feet / STATUTE_MILES_TO_FEET;
	}
	
	public double convertMilesToFeet(double miles) {
		return miles * STATUTE_MILES_TO_FEET;
	}
	
	public double convertYardsToFeet(double yards) {
		return yards * YARDS_TO_FEET;
	}

	public double convertFeetToYards(double feet) {
		return feet / YARDS_TO_FEET;
	}
	
	public double convertInchesToYards(double inches) {
		/* 
		 * Convert Feet <= Inches
		 * Convert Yards <= Feet
		 */
		double feet = convertInchesToFeet(inches);
		double yards = convertFeetToYards(feet);
		
		return yards;
	}
	
	public double convertYardsToInches(double yards) {
		/* 
		 * Convert Feet <= Yards
		 * Convert Inches <= Feet
		 */
		double feet = convertYardsToFeet(yards);
		double inches = convertFeetToInches(feet);
		
		return inches;
	}
	
	public double convertCentimetersToFeet(double cm) {
		/* 
		 * Convert Inches <= Cm
		 * Convert Feet <= Inches
		 */
		double inches = convertCentimetersToInches(cm);
		double feet = convertInchesToFeet(inches);
		
		return feet;
	}

	public double convertFeetToCentimeters(double feet) {
		/* 
		 * Convert Feet <= Yards
		 * Convert Inches <= Feet
		 */
		double inches = convertFeetToInches(feet);
		double cm = convertInchesToFeet(inches);
		
		return cm;
	}
}
