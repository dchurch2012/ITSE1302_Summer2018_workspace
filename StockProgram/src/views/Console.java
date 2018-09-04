package views;

/**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. */
 
 /**
 *  <h1>Class ArrayListComparator Close Description</h1></br>
 *
 * This class implements the View Interface 
 *  printData is an Abstract method implemented differently
 * Depending on the device - the console in this case
 * 
 */
public class Console implements View {
	/**
	* Constructor override
	* @param - String str
	* Prints the string to the console
	*/
	public void printData(String str) {
		System.out.println(str);
	}
	
	/**
	* Constructor override
	* @param - String str2
	* @param - String str2
	* @param - String str3
	* Prints each string to the console (formatted to 12,4 and 32 places respectively
	*/
	public void printData(String str1, String str2, String str3) {
		System.out.format("%12s%4s%32s", str1, str2, str3);    
	}

	/**
	* Constructor override
	* @param -Double dbl
	* Prints the double value to the console
	*/
	public void printData(Double dbl) {
		System.out.println(dbl);
	}
}

