package views;

//package StockProgram.Views;

/**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. */
 
 /**
 *  <h1>Interface View Description</h1></br>
 *
 */

public interface View
{
	/**
	* Print data to device (override)
	* @param String str - String to display.
	*/
	public void printData(String str);
	
	/**
	* Print data to device (override)
	* @param String str1 - String to display.
	* @param String str2 - String to display.
	* @param String str3- String to display.
	*/
	public void printData(String str1, String str2, String str3);
	
	/**
	* Print data to device (override)
	* @param Double dbl - Double value to display.
	*/
	public void printData(Double dbl);
	
}

