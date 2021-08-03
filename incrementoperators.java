import java.util.Scanner; 

class incrementoperators {
	public static void main(String args[]) {
		Scanner operators = new Scanner(System.in); 
		
		int apples = 5;
		int bananas = 18; 

		apples += 8;
		apples *= 8;
		
		--apples; 
		

		System.out.println(apples); 
	}
}