import java.util.Scanner; 

class mathoperators {
	public static void main(String args[]){
		Scanner operators = new Scanner(System.in);
		
		int apples, bananas, fruits;
		apples = 7;
		bananas = 3;
		fruits = apples % bananas;
		System.out.println(fruits); 		
	}
}