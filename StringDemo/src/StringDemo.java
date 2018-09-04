
public class StringDemo {
	public static int someNumber = 5;
	
	public static void main(String[] args ) {
		String string1 = "This is a string";
		String string2 = new String("This is a string");
		 
		if(string1 == string2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		
		if(string1.equals(string2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		
		string2  = "this is a new string 2";
		
		System.out.println(string2);
	}
		
}
