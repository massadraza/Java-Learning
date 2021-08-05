// (rungrades.java)

import java.util.Scanner;

class grades{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		rungrades rungradesObject = new rungrades();
		
		System.out.println("Please Enter Your Grade!");

		String rungrades = input.nextLine(); 	
		rungradesObject.runPrinter(rungrades);
		rungradesObject.gradeprint(); 
	}
}