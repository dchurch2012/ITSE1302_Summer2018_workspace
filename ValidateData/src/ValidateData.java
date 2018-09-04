import java.io.*;
import java.lang.Object;

/**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. 
 *
 *  <h1>Class Validate Description</h1><br>
 *
 *  Accepts a string that represents a number - validates that<br>
 *  the user entered a number only and in correct format<br>
 *
 * <br>Examples:<br><br>
 *
 * 3.21	--	Valid<br>
 * 3.2AB --	Invalid<br>
 * ABC	--	Invalid<br>
 * 3.2.2 --	Invalid<br>
 *
 *
 *<h2>ALGORITHM</h2>
  *<br>&nbsp;&nbsp;For index = 0 to String length
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;IF Data[index] Is a Digit OR Data[index] Is a Decimal Point Then
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BEGIN
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF Data[index] Is a Decimal Point
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BEGIN&nbsp;&nbsp;
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Increment DecCount
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF DecCount .GT. 1 Then
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BEGIN
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return FALSE
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;END
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;END
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ELSE
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Return FALSE
 *<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ENDIF
 *<br>&nbsp;&nbsp;NEXT index
 *<br>&nbsp;&nbsp;Return TRUE
  */
 
public class ValidateData {
	/** Description of ValidateData(String input_string)
	* 
	* @param	inputString 		String inputString
	* @return 	boolean -- true => valid data;false=>invalid
	*/
	public boolean validateDecimal(String inputString)
	{
		/** To store length of string */
		int length = inputString.length();
		
		/** looping index */
		int index = 0;
		
		/** Keep track of decimal count */
		int decCount = 0;
		
		/** Loop through each character in string */
		for(index = 0; index < length; index++)
		{
			if (index == 0)
			{
				/** If Character Is a minus sign (-) -- then proceed */
				if(inputString.charAt(index) == '-')
				{
					if(length == 1)
					{
						return false;
					}
					else {
						index++;
					}
				}
				else
				{
					/** Past the first index, if Character Is a Digit OR a Decimal Point -- then proceed */
					if(Character.isDigit(inputString.charAt(index)) || inputString.charAt(index) == '.')
					{
						/** If Character IS a decimal -- increment decCount (so we can reject multiple decimal points (invalid)) */
						if(inputString.charAt(index) == '.')
						{
							decCount++;
						}
						/** Don't allow more than 1 decimal point */
						if(decCount > 1)
						{
							return false;
						}
					}
					else
					{
						/** Character is NOT valid - so return false */
						return false;
					}
				}
			}
			else
			{
				/** Past the first index, if Character Is a Digit OR a Decimal Point -- then proceed */
				if(Character.isDigit(inputString.charAt(index)) || inputString.charAt(index) == '.')
				{
					/** If Character IS a decimal -- increment decCount (so we can reject multiple decimal points (invalid)) */
					if(inputString.charAt(index) == '.')
					{
						decCount++;
					}
					/** Don't allow more than 1 decimal point */
					if(decCount > 1)
					{
						return false;
					}
				}
				else
				{
					/** Character is NOT valid - so return false */
					return false;
				}
			}	
		}
		
		/** Got this far without returning - so data must be valid */
		return true;
	}

	/** Description of validateInteger(String input_string)
	* 
	* @param	inputString 			String inputString
	* @return 	boolean -- true => valid data;false=>invalid
	*/
	public boolean validateInteger(String inputString) {
		/** To store length of string */
		int length = inputString.length();
		
		/** looping index */
		int index = 0;
		
		/** Loop through each character in string */
		for(index = 0; index < length; index++)
		{
			if (index == 0)
			{
				/** If Character Is a minus sign (-) -- then proceed */
				if(inputString.charAt(index) == '-')
				{
					if(length == 1)
					{
						return false;
					}
					else {
						index++;
					}
				}
				else
				{
					/** Past the first index, if Character Is a Digit OR a Decimal Point -- then proceed */
					if(!Character.isDigit(inputString.charAt(index)))
					{
						/** Character is NOT valid - so return false */
						return false;
					}
				}
			}
			else
			{
				/** Past the first index, if Character Is a Digit */
				if(!Character.isDigit(inputString.charAt(index)))
				{
					/** Character is NOT valid - so return false */
					return false;
				}
			}	
		}
		
		/** Got this far without returning - so data must be valid */
		return true;
	}
}	//end class Validate

	
