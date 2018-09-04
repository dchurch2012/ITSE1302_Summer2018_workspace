package stock;

import java.util.Comparator;
 
/**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. */
 
 /**
 *  <h1>Class ArrayListComparator Close Description</h1></br>
 *
 * This class implements the Comparator interface overriding 
 *  the compare method.
 * 
 * In this class, the comparator interface is used to compare the Close
 * field - in other words, sort the ArrayList of StockQuote, based on Close Price
 */
public class ArrayListComparatorClose implements Comparator<StockQuote>
{
  	/**
	* Constructor.
	* Nothing to do yet
	*/
	public ArrayListComparatorClose() 
	{
		/** Do Nothing for now */
	}	 

	@Override
	/** Description of compare(StockQuote o1, StockQuote o2)
	 * 
	 * @param o1, o2 - StockQuote
	 * Called by ArrayList class to sort based on Close Price for Day
	 */
	public int compare(StockQuote o1, StockQuote o2) 
	{
		/** less = -1, greater = 1, equal = 0 */
		if(o1.getClose() < o2.getClose()) 
		{
			return -1;
		 }
		 else
		 if(o1.getClose() > o2.getClose())
		 {
			return 1;
		 }
		else
		 {
			return 0;
		 }	
	}
}

