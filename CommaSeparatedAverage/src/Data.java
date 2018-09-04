import java.util.Comparator;

public class Data implements Comparable<Data> {
	private double value;
	private int valid;
	private String strValue;
	
	public Data(double value, int valid) {
		this.value = value;
		this.valid = valid;
	}
	
	public Data(double value, String strValue, int valid) {
		this.strValue = strValue;
		this.valid = valid;
		this.value = value;
	}
	
	public Data(String strValue, int valid) {
		this.strValue = strValue;
		this.valid = valid;
		this.value = 0;
	}
	
	public String getStrValue() {
		return this.strValue;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getValid() {
		return this.valid;
	}
	
	
	public void setValid(int valid) {
		this.valid = valid;
	}
	
	@Override
	public int compareTo(Data compareData) {

		double compareNum = ((Data) compareData).getValue();

		//ascending order
		if((this.value - compareNum) > 0)
			return 1;
		else
		if((this.value - compareNum) == 0)
			return 0;
		else
			return -1;

		//descending order
		//return compareNum - value;

	}

	public static Comparator<Data> DataNameComparator
                          = new Comparator<Data>() {

	    public int compare(Data Data1, Data Data2) {

	      double DataName1 = Data1.getValue();
	      double DataName2 = Data2.getValue();

	      //ascending order
	      if((DataName1 - DataName2) > 0)
			return 1;
		  else
		  if((DataName1 - DataName2) < 0) {
			return -1;
		  }
		  else {
			return 0;
		  }
	    }

	};
	
    @Override
    public String toString() {
        return "[ value=" + value + ", valid=" + valid + "]";
    }
	
}

