package stock;

import java.io.*;
import java.util.*; 

import views.*;

public class StockQuoteContainer
{
	protected String input_data = "|";
	protected static ArrayList<StockQuote> List = new ArrayList<StockQuote>();
	protected View vw = null;
	
	public StockQuoteContainer(View vw)
	{
		this.vw = vw;
	}

	public int readDataFile(String filename)
	{
		FileReader fr = null;
		BufferedReader br = null;
		String input = "";
		StockQuote quote = null;

		try 
		{
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			 
			while ((input = br.readLine()) != null)
			{
				String[] columns = input.split(",");
				quote = new StockQuote();
			
				quote.Date = columns[0];
				quote.Ticker = columns[1];
				quote.Open = Double.parseDouble(columns[2]);
				quote.High = Double.parseDouble(columns[3]);
				quote.Low = Double.parseDouble(columns[4]);
				quote.Close = Double.parseDouble(columns[5]);
				quote.Volume_for_day = Double.parseDouble(columns[6]);

				List.add(quote);
			}
		}
		catch(IOException except)
		{
			System.out.println(except.getMessage());
		}
		finally 
		{
			try
			{
				if (fr != null) 
				{
				  fr.close();
				}
				}
				catch(IOException except)
				{
					System.out.println(except.getMessage());
				}
		}
		return 0;
	}

	public void SortByOpen()
	{
		Collections.sort(List, new ArrayListComparatorOpen());

		vw.printData("Sort by Open");

		for(StockQuote temp: List)
		{
			vw.printData("Date",":",temp.getDate());
			vw.printData("Ticker",":",temp.getTicker());
			vw.printData("Open",":",Double.toString(temp.getOpen()));
			vw.printData("High",":",Double.toString(temp.getHigh()));
			vw.printData("Low",":",Double.toString(temp.getLow()));
			vw.printData("Close",":",Double.toString(temp.getClose()));
			vw.printData("Volume_for_day",":",Double.toString(temp.getVolume_for_day()));
			vw.printData("");
		}  
	}

	public void SortByClose()
	{
		Collections.sort(List, new ArrayListComparatorClose());

		vw.printData("Sort by Close");

		for(StockQuote temp: List)
		{
			vw.printData("Date",":",temp.getDate());
			vw.printData("Ticker",":",temp.getTicker());
			vw.printData("Open",":",Double.toString(temp.getOpen()));
			vw.printData("High",":",Double.toString(temp.getHigh()));
			vw.printData("Low",":",Double.toString(temp.getLow()));
			vw.printData("Close",":",Double.toString(temp.getClose()));
			vw.printData("Volume_for_day",":",Double.toString(temp.getVolume_for_day()));
			vw.printData("");
		}  
	}
	
	//ArrayListComparatorHigh
	public void SortByHigh()
	{
		Collections.sort(List, new ArrayListComparatorHigh());

		for(StockQuote temp: List)
		{
			vw.printData("Date",":",temp.getDate());
			vw.printData("Ticker",":",temp.getTicker());
			vw.printData("Open",":",Double.toString(temp.getOpen()));
			vw.printData("High",":",Double.toString(temp.getHigh()));
			vw.printData("Low",":",Double.toString(temp.getLow()));
			vw.printData("Close",":",Double.toString(temp.getClose()));
			vw.printData("Volume_for_day",":",Double.toString(temp.getVolume_for_day()));
			vw.printData("");
		}  
	}
	
	//ArrayListComparatorLow
	public void SortByLow()
	{
		Collections.sort(List, new ArrayListComparatorLow());

		for(StockQuote temp: List)
		{
			vw.printData("Date",":",temp.getDate());
			vw.printData("Ticker",":",temp.getTicker());
			vw.printData("Open",":",Double.toString(temp.getOpen()));
			vw.printData("High",":",Double.toString(temp.getHigh()));
			vw.printData("Low",":",Double.toString(temp.getLow()));
			vw.printData("Close",":",Double.toString(temp.getClose()));
			vw.printData("Volume_for_day",":",Double.toString(temp.getVolume_for_day()));
			vw.printData("");
		}  
	}
	
	//ArrayListComparatorVolume_for_day
	public void SortByVolume_for_day()
	{
		Collections.sort(List, new ArrayListComparatorVolume_for_day());

		for(StockQuote temp: List)
		{
			vw.printData("Date",":",temp.getDate());
			vw.printData("Ticker",":",temp.getTicker());
			vw.printData("Open",":",Double.toString(temp.getOpen()));
			vw.printData("High",":",Double.toString(temp.getHigh()));
			vw.printData("Low",":",Double.toString(temp.getLow()));
			vw.printData("Close",":",Double.toString(temp.getClose()));
			vw.printData("Volume_for_day",":",Double.toString(temp.getVolume_for_day()));
			vw.printData("");
		}  
	}
	
}