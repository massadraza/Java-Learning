//This lesson (Using Methods with Parameters is associated with name.java

import java.util.Scanner;

class storage {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		name nameObject = new name ();
		
		System.out.println("Please Enter Your Name");
		String name = input.nextLine();
		
		nameObject.namePrinter(name); 
	}
}