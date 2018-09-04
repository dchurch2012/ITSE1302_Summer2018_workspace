import java.util.*;
import java.text.DecimalFormat;

public class CommaSepAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = "|";
		double number = 0;
		
		ValidateData validate = new ValidateData();
		ArrayList<Data> dataList = new ArrayList<Data>();
		
		
		System.out.println("Enter your data in comma separated format : ");
		inputString = scan.nextLine();
		
		String[] numbers = inputString.split(",");
		
		Data data = null;
		
		for(String w:numbers ){  
			System.out.println(w); 

			if(validate.validateDecimal(w)) {
				number = Double.parseDouble(w);
			
				data = new Data(number,w,1);
			}
			else {
				data = new Data(w,0);
			}
			dataList.add(data);
		}  
		
		System.out.println("Your sorted Data : ");
		
		Collections.sort(dataList);
		
		
		DecimalFormat fmt = new DecimalFormat("0000.00");
	
		for(Data dat:dataList) {
		
			System.out.print("  : ");
			
			if(dat.getValid() == 0) {
				String line = String.format("Data Value : %7s : String Value : %10s", "-----",dat.getStrValue());
				System.out.print(line);
				System.out.println("   INVALID DATA!!!");
			}
			else {
				String line = String.format("Data Value : %7.2f : String Value : %10s", dat.getValue(),dat.getStrValue());
				System.out.print(line);
				System.out.println("   VALID DATA!!!");
			}
			
		
		}
	}
}