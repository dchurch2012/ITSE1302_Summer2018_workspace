package stock;
/**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. */
 
 /**
 *  <h1>Stock Class Description</h1></br>
 *
 *  Class Is :
 *
 *	1. A container for Dow Jones stock quotes
 *
 */
 
public class StockQuote
{
	/** Date */
	protected String Date;
	
	/** Ticker Symbol */
	protected String Ticker;
	
	/** Day's Opening Price */
	protected double Open;
	
	/** High Price for the day*/
	protected double High;
	
	/** Low Price for the day */
	protected double Low;
	
	/** Closing Price for the day */
	protected double Close;
	
	/** Volume for the Day */
	protected double Volume_for_day;
	
	/**
	 * Setter for Date. 
	 * @param   date  the date to be stored.
	 */
	public void setDate(String date)
	{
		this.Date = date;
	}
	
	/**
	* Setter for Ticker Symbol. 
	* @param   Ticker Symbol to be stored
	*/
	public void setTicker(String Ticker)
	{
		this.Ticker = Ticker;
	}
	
	/**
	* Setter for Open value 
	* @param Open - Opening value to be stored
	*/
	public void setOpen(double Open)
	{
		this.Open = Open;
	}
	
	/**
	* Setter for High value 
	* @param High - High value to be stored
	*/
	public void setHigh(double High)
	{
		this.High = High;
	}
	
	/**
	* Setter for Low value 
	* @param Low - Low value to be stored
	*/
	public void setLow(double Low)
	{
		this.Low = Low;
	}
	
	/**
	* Setter for Close value 
	* @param Close - Close value to be stored
	*/
	public void setClose(double Close)
	{
		this.Close = Close;
	}
	
	/**
	* Setter for Volue value 
	* @param Volume - Volume value to be stored
	*/
	public void setVolume_for_day(double Volume)
	{
		this.Volume_for_day = Volume;
	}
	
	/**
	* Getter for Date
	* @return Date - String
	*/
	public String getDate()
	{
		return Date;
	}
	
	/**
	* Getter for Ticker
	* @return Ticker - String
	*/
	public String getTicker()
	{
		return Ticker;
	}
	
	/**
	* Getter for Open Price
	* @return Open Price - double
	*/
	public double getOpen()
	{
		return Open;
	}
	
	/**
	* Getter for High Price
	* @return High Price - double
	*/
	public double getHigh()
	{
		return High;
	}
	
	/**
	* Getter for High Price
	* @return High Price - double
	*/
	public double getLow()
	{
		return Low;
	}
	
	/**
	* Getter for Close Price
	* @return Close Price - double
	*/
	public double getClose()
	{
		return Close;
	}
	
	/**
	* Getter for Volume for Day Price
	* @return Volume for Day Price - double
	*/
	public double getVolume_for_day()
	{
		return Volume_for_day;
	}
	
	public StockQuote()
	{
		/** Initialize Date = Empty String */
		Date = "";
		
		/** Initialize Ticker = Empty String */
		Ticker = "";
		
		/** Initialize Open Price to 0 */
		Open = 0;
		
		/** Initialize High Price to 0 */
		High = 0;
	
		/** Initialize Low Price to 0 */
		Low = 0;
		
		/** Initialize Closing Price to 0 */
		Close = 0;

		/** Initialize Day's Volume to 0 */
		Volume_for_day = 0;
	}
}