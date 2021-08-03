import java.util.Scanner; 

class calculator {
	public static void main(String args[]) {
		Scanner number = new Scanner(System.in); 
		double firstnumber, secondnumber, answer;
		System.out.println("Enter first number: ");
		firstnumber = number.nextDouble(); 
		System.out.println("Enter second number: "); 
		secondnumber = number.nextDouble(); 
		answer = firstnumber + secondnumber; 
		System.out.println(answer); 
	}
}
