
import java.util.*;

public class ArrayDemo {
	static final int ARRAY_SIZE = 20;
	static final int ARRAY_DIM_ONE = 4;
	static final int ARRAY_DIM_TWO = 10;
	static final int ARRAY_DIM_THREE = 6;
		
	public static void main(String[] args) {
		OneDArrayDemo();
		TwoDArrayDemo();
		ThreeDArrayDemo();
		ArrayList<Integer> numberList = ArrayListDemo();
		
		for(int index = 0; index < numberList.size(); index++) {
			System.out.println("Array List [" + index +"] = " + numberList.get(index));
		}
		
	}
	
	public static void OneDArrayDemo() {
		int[] numIntegers = null;
		numIntegers = new int[ARRAY_SIZE];
		
		//int someNum = 34;
		
		// Can't do this -- an int is a primitive data type;
		// Not an object (class) -- it does not contain methods
		// or data other than the 64 bits that represents an integer
		//int sizeNum = someNum.length;
		
		System.out.println("The Following is a one-dimensional Array");
		System.out.println();
				
		for(int index = 0; index < numIntegers.length; index++) {
			numIntegers[index] = index;
		}

		for(int index = 0; index < numIntegers.length; index++) {
			System.out.printf("%02d", numIntegers[index]);
			System.out.println();
		}
		System.out.println();
	}
	
	public static void TwoDArrayDemo() {
		
		int dim2[][] = new int[ARRAY_DIM_ONE][ARRAY_DIM_TWO];
		Random rand = new Random();
		
		System.out.println("The Following is a 2-dimensional Array");
		System.out.println();
		
		for(int index = 0; index < dim2.length; index++) {
			for(int jindex = 0; jindex < dim2[index].length; jindex++) {
				dim2[index][jindex] = rand.nextInt(20);
			}
			
		}
		
		for(int index = 0; index < dim2.length; index++) {
			for(int jindex = 0; jindex < dim2[index].length; jindex++) {
				
				System.out.printf("%02d", dim2[index][jindex]);
				
				if(jindex != dim2[index].length-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void ThreeDArrayDemo() {
		
		int dim3[][][] = new int[ARRAY_DIM_ONE][ARRAY_DIM_TWO][ARRAY_DIM_THREE];
		Random rand = new Random();
		
		System.out.println();
		System.out.println("The Following is a 3-dimensional Array");
		System.out.println();
	
		System.out.println("Note: You will observe : " + ARRAY_DIM_ONE + ", " + ARRAY_DIM_TWO + " X " + ARRAY_DIM_THREE + " ARRAYS");
		System.out.println();
		
		for(int index = 0; index < dim3.length; index++) {
			for(int jindex = 0; jindex < dim3[index].length; jindex++) {
				for(int kindex = 0; kindex < dim3[index][jindex].length; kindex++) {
					dim3[index][jindex][kindex] = rand.nextInt(32);
				}
			
			}
		}
		
		int arrayCount = 1;
		
		for(int index = 0; index < dim3.length; index++) {
			System.out.println("ARRAY # " + arrayCount++);
			for(int jindex = 0; jindex < dim3[index].length; jindex++) {
				for(int kindex = 0; kindex < dim3[index][jindex].length; kindex++) {
					System.out.printf("%02d", dim3[index][jindex][kindex]);
					
					if(kindex != dim3[index][jindex].length-1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			}
		}
	
	public static ArrayList<Integer> ArrayListDemo() {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		int number = 0;
		Scanner scan = new Scanner(System.in);
		
		while(number != -999) {
			System.out.println("Enter a number -999 to quit");
			
			number = scan.nextInt();
			intList.add(number);
		}
		return intList;
	}
}
