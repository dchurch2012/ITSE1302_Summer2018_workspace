import java.util.*;

public class Statistics { 
	public void performStats() { 
		double average = 0;
		int index = 0;
		ArrayList<Mode> modeList = null;
		
		ArrayList<Double> numberList = getUserData();
		Collections.sort(numberList);
		
		printNumberList(numberList);
		
		//Compute Mean
		if(numberList.size() > 0) {
			average = computeMean(numberList);
		}
	
		//Compute Median
		double median = computeMedian(numberList);
		
		//Compute range
		double range = computeRange(numberList);
		
		//Compute Mode
		modeList = computeMode(numberList);

		int modeSize = -1;

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Display Summary Statistics
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		
		System.out.println("===========================================================");
		System.out.println("Summary Statistics");
		System.out.println("===========================================================");
		
		//Display Average
		if(numberList.size() > 0) {
			System.out.format("%-10s %08.10f","Average",average);
		}
		else {
			System.out.println("No data entered -- nothing to average");
		}
		
		System.out.println();
		System.out.format("%-10s %08.10f","Median",median);
		System.out.println();
		System.out.format("%-10s %08.10f","Range",range);
		System.out.println();
			
		System.out.println();
		System.out.println();
		
		if(modeList == null) {
			modeSize = 0;
		}
		else {
			modeSize = modeList.size();
			System.out.println("Mode List Size : " + modeList.size());
		}
		
		switch(modeSize) {
				case 0:
					System.out.println("No Mode");
					break;
					
				case 1:
					System.out.println("Mode : ");
					System.out.print("Number : " + modeList.get(0).getNumber());
					System.out.print(" ");
					System.out.println("Frequency : " + modeList.get(0).getFrequency());
					break;
				
				case 2:
					System.out.println("Bi-Modal : ");
					for(index = 0; index < modeSize; index++) {
						System.out.print("Number : " + modeList.get(index).getNumber());
						System.out.print(" ");
						System.out.println("Frequency : " + modeList.get(index).getFrequency());
					}
					break;
							
				default:
					System.out.println("Multi-Modal : ");
					
					for(index = 0; index < modeSize; index++) {
							System.out.print("Number : " + modeList.get(index).getNumber());
							System.out.print(" ");
							System.out.println("Frequency : " + modeList.get(index).getFrequency());
					}
					break;
		}
	}	
	
	public Mode FindMode(ArrayList<Mode> modeList, double number) {
		for(Mode mode : modeList) {
			if(mode.getNumber() == number) {
				return mode;
			}
		}
		return null;
	}
		
	public void AddMode(double currentNum, ArrayList<Mode> modeList) {
		Mode mode = new Mode(currentNum,1);
		modeList.add(mode);
	}
	
	public void incrementFrequency(Mode mode) {
		int frequency = mode.getFrequency() + 1;
		mode.setFrequency(frequency);
	}
	
	public ArrayList<Double> getUserData() {
		Scanner scan = new Scanner(System.in);
		String inputData = "|";
		ArrayList<Double> dataList = new ArrayList<Double>();
		double number = 0;
		ValidateData validate = new ValidateData();
		
		System.out.println("Enter a series of numbers - nothing followed by enter to finish");
		
		try {
			while(inputData.length() > 0) {
				inputData = scan.nextLine();
				
				if(inputData.length() > 0) {
						if(validate.validateDecimal(inputData)) {
							number = Double.parseDouble(inputData);
							dataList.add(number);
						}
						else {
							System.out.println("Invalid Data - Please enter a valid number");
						}
				}
			
			}
		} 
		catch(Exception except) {
			System.out.println(except.getMessage());
		}
	
		scan.close();
		return dataList;
	}
	
	public double computeMean(ArrayList<Double> modeList) {
		int count = modeList.size();
		double sum = 0;
		double average = 0;
		
		for(int index = 0; index < count; index++) {
			sum += modeList.get(index);
		}
		average = sum / count;
		return average;
	}

	public double computeMedian(ArrayList<Double> modeList) {
		int length = modeList.size();
		double value = 0;
		int rem = length % 2;
		int index = length / 2;
		
		//Even count - find average of middle 2 values
		if(rem == 0) {
			value = (modeList.get(index) + modeList.get(index-1)) / 2;
		}
		//Odd count - return middle value
		else {
			value = modeList.get(index);
		}
		return value;
	}
	
	public ArrayList<Mode> computeMode(ArrayList<Double> numberList) {
		ArrayList<Mode> modeList = new ArrayList<Mode>();
		Mode mode = null;
		double lastNum = -1;
		double currentNum = -1;
			
		Collections.sort(numberList);
		
		lastNum = numberList.get(0);
		
		AddMode(numberList.get(0),modeList);
		
		for(int index = 1; index < numberList.size(); index++)
		{
			currentNum = numberList.get(index);
			
			if(currentNum == lastNum) 
			{
				if((mode = FindMode(modeList,currentNum)) != null) 
					incrementFrequency(mode);
				else
					System.out.println("ERROR");
			}
			else 
			{
				AddMode(currentNum,modeList);
				lastNum = currentNum;
			}
		}	
	
		//Sort in DESCENDING order
		Collections.sort(modeList, Collections.reverseOrder(new ModeComparator()));
		
		int count =0;
		int stopIndex = 0;
		lastNum = modeList.get(0).getFrequency();
		int length = modeList.size();
		
		printModeList(modeList);
		
		for(int index = 0; index < length; index++) {
			currentNum = modeList.get(index).getFrequency();
			
			if(currentNum != lastNum) {
				stopIndex = index;
				lastNum = currentNum;
				break;
			}
			else {
				count++;
			}
		
			if(count == modeList.size()) {
				return null;
			}
		}
		modeList.subList(stopIndex, length).clear();
		return modeList;
	}
	
	public void printNumberList(ArrayList<Double> numberList) {
			System.out.println("Entered Data in ascending order : ");
			
			for(Double number : numberList) {
				System.out.println(number);
			}
			 System.out.println();
	}
	
	public void printModeList(ArrayList<Mode> modeList) {
		System.out.println();
		System.out.println("Mode List BEGIN");
		
		for(int index = 0; index < modeList.size(); index++) {
			System.out.print("\t");
			System.out.print(modeList.get(index).getNumber());
			System.out.print("|");
			System.out.println(modeList.get(index).getFrequency());
		}
		System.out.println("Mode List END");
		System.out.println();
	}

	public double computeRange(ArrayList<Double> numberList) {
		double min = numberList.get(0);
		double max = numberList.get(numberList.size()-1);
		
		return (max-min);
	}
	
	
	public double computeStdDeviation(ArrayList<Double> dataList) {
		int count = dataList.size();
		double sum = 0;
		
		for(int index = 0; index < count; index++) {
			sum += Math.pow(dataList.get(index),2);
		}
		
		
		return Math.sqrt(sum / count);
	}

	
	public ArrayList<Double> computeWeightedMovingAverage(ArrayList<Double> dataList, int window) {
		return null;
	}
	
	public ArrayList<Double> computeExponentialMovingAverage(ArrayList<Double> dataList, int window) {
		return null;
	}
	
	public ArrayList<Double> computeCenteredMovingAverage(ArrayList<Double> dataList, int window) {
		return null;
	}
	
	
	public ArrayList<Double> computeMovingAverage(ArrayList<Double> dataList, int window) {
		int count = dataList.size();
		ArrayList<Double> movingAverage = new ArrayList<Double>();
		
		double sum = 0;

		
		//DO i = 1, Size-Window+1                  ! for each xi
		//	Sum = 0.0                              ! compute the moving average
		//	DO j = i, i+Window-1                   ! of xi, x(i+1), ...,
		//		Sum = Sum + x(j)                   ! x(i+Window-1).
		//		END DO
		//		Avg(i) = Sum / Window              ! save the result
		//END DO

   
		for(int index = 0; index < (count-window); index++) {
			sum = 0;
			
			for(int jindex = index; jindex < (index+window); jindex++) {
				sum += dataList.get(jindex);
			}
			movingAverage.add(sum / window);
		}
	
	
		return movingAverage;
	}
}
