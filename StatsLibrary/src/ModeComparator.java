import java.util.Comparator;
 
/**
 * @author David Church
 * @version 1.0.0 Build 1 June 20, 2016. 
 */
public class ModeComparator implements Comparator<Mode>
{
  	/**
	* Constructor.
	* Nothing to do yet
	*/
	public ModeComparator() 
	{
		/** Do Nothing for now */
	}	 

	@Override
	public int compare(Mode m1, Mode m2) 
	{
		/** less = -1, greater = 1, equal = 0 */
		if(m1.getFrequency() < m2.getFrequency()) 
		{
			return -1;
		 }
		 else
		if(m1.getFrequency() > m2.getFrequency()) 
		 {
			return 1;
		 }
		else
		 {
			return 0;
		 }	
	}
}

