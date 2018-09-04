package stock;

import java.util.Comparator;
 /**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. */
 
 /**
 *  <h1>Class ArrayListComparatorVolume_for_day Description</h1></br>
 *
 * This class implements the Comparator interface overriding 
 *  the compare method.
 * 
 * In this class, the comparator interface is used to compare the Volume_for_day
 * field - in other words, sort the ArrayList of StockQuote, based on Volume_for_day
 *
 */
 public class ArrayListComparatorVolume_for_day implements Comparator<StockQuote>
{
  /**
   * Constructor.
   * Nothing to do yet
   */
	public ArrayListComparatorVolume_for_day() 
	{
		/** Nothing to do here for now */
	}
	
	/** Description of compare(StockQuote o1, StockQuote o2)
	 * 
	 * @param o1, o2 - StockQuote
	 * Called by ArrayList class to sort based on Volume_for_day
	 */
	public int compare(StockQuote o1, StockQuote o2) 
	{
		/** less = -1, greater = 1, equal = 0 */
		 if(o1.getVolume_for_day() < o2.getVolume_for_day()) 
		 {
			return -1;
		 }
		 else
		 if(o1.getVolume_for_day() > o2.getVolume_for_day())
		 {
			return 1;
		 }
		 else
		 {
			return 0;
		 }	
	}
}

