package stockProgram;

import views.*;
import stock.*;

/**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. */
 
 /**
 *  <h1>Program StockQuoteProcessor Description</h1></br>
 *
 *  Ussge :% java StockQuoteProcessor
 *
 *  This program demonstrates :
 *
 *	1. Reading Input from a file, parsing each column of data from each line of data.
 *  2. Add the current StockQuote to the ArrayList.
 *	3. Sorting the ArrayList on various fields.
 *	4. Displaying the Results using a View that can be replaced (Console, GUI, etc.)
 *
 */
 
  /**
  *	ALGORITHM
  *
  *	1. Create View to display  
  *	2. Create StockQuoteContainer
  *	3. While More records to read
  * 4. 	Read Stock Quote file and parse individual columns
  *	5. 	Add Current record to ArrayList
  *	6. While End
  *	7. Sort Stock List by Open and Display Stock List
  *	8. Sort Stock List by Close and Display Stock List
  */
  
public class StockQuoteProcessor{
	/** Create an abstract I/O Interface */
	private static View vw = new Console();
	
	/** Create StockQuote Container to Hold List of Stocks */
	private static StockQuoteContainer stock_container = new StockQuoteContainer(vw);

	/** Description of main(String[] args)
	 * 
	 * @param args		String[] args
	 * This is the main routine required for ALL Java console programs
	 */
	public static void main(String[] args) 
	{
		/** Filename from which to read data */
		String filename = null;

		if (args.length > 0) 
		{
			try 
			{
				filename = args[0];
			} 
			catch (Exception except) 
			{
				System.err.println("Argument" + args[0] +  except.getMessage());
				System.exit(1);
			}
		}
		else
		{
			System.err.println("Usage : StockQuoteProcessor filename");
			System.exit(2);
		}
	
		/** Read file */
		stock_container.readDataFile(filename);
		
		/** Sort Data by Open Price */
		stock_container.SortByOpen();
		
		/** Sort Data by Close Price */
		stock_container.SortByClose();
		
		return;
	}
}