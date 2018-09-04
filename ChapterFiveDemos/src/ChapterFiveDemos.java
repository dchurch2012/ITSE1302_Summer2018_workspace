
import java.util.*;

public class ChapterFiveDemos {
	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		System.out.println("           Loop Demonstrator");
		System.out.println("Enter 1 for normalWhileLoop");
		System.out.println("Enter 2 for normalForLoop");
		System.out.println("Enter 3 for simpleDoLoop");
		System.out.println("Enter 4 for infiniteLoop01");
		System.out.println("Enter 5 for infiniteLoop02");
		System.out.println("Enter 6 for neverLoop01");
		System.out.println("Enter 7 for singleDoExecute");
		System.out.println("-------------------------------------");
	
		int choice = getChoice();
		
		demoLoop(choice);
			
	}
	
	public static void normalWhileLoop() {
		boolean done = false;
		int index = 0;
	
		while(!done) {
			System.out.println("This loop will terminate...");
		
			index++;
			if(index > 20) {
				done = true;
			}
		}
	}
	
	public static void normalForLoop() {
		int index = 0;

		//For Loop 
		for(index = -10; index > 0; index -= 4) {
			System.out.println("This Loop Should Execute 10 times" + " We are now in loop index number " + index);
		}
		System.out.println("Final index value : " + index);
	}
	
	public static void simpleDoLoop() {
		int index = 0;
		
		do {
			index++;
			System.out.println(index);
			
		} while(index < 100);
	}
	
	public static void infiniteLoop01() {
		boolean done = false;
		int index = 0;
	
		while(!done) {
			System.out.println("infiniteLoop01...");
		
			index--;
			if(index > 20) {
				done = true;
			}
		}
	}
	
	public static void infiniteLoop02() {
		boolean done = false;
		int index = 0;
	
		//Note the Semi=Colon!!!!
		while(!done); {
			System.out.println("infiniteLoop02...");
		
			index++;
			if(index > 20) {
				done = true;
			}
		}
	}

	public static void neverLoop01() {
		int index = 0;
	
		System.out.println("Inside neverLoop01 -- But no Loop Execution!");
		while(index > 20) {
			System.out.println("Inside While Loop");
		
			index++;
		}
	}
	
	public static void singleDoExecute() {
		int index = 0;
	
		do {
			System.out.println("Inside While Loop");
		
			index++;
		} while(index > 20);
	}
	
	public static int getChoice() {
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		ValidateData validate = new ValidateData();
		boolean done = false;
		
		String inputString = "}";
		
		while(!done) {
			inputString = scan.nextLine();
			
			if(inputString.length() > 0) {
				if(validate.validateInteger(inputString)) {
					choice = Integer.parseInt(inputString);
					done = true;
				}
				else {
					System.out.println("Invalid data - please enter an integer");
				}
			}
		}
		
		scan.close();
		return choice;
	}
	
	
	public static void demoLoop(int choice) {
		
		switch(choice) {
		case 1:
			normalWhileLoop();
			break;
			
		case 2:
			normalForLoop();
			break;

		case 3:
			simpleDoLoop();
			break;

		case 4:
			infiniteLoop01();
			break;

		case 5:
			infiniteLoop02();
			break;

		case 6:
			neverLoop01();
			break;

		case 7:
			singleDoExecute();
			break;

		default:
			System.out.println("Please enter 1-8");
			break;
			}
	}
}
