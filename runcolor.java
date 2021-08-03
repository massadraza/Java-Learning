// This lesson (Many Methods and Instances) is associate with storagecolor.java

import java.util.Scanner;

class runcolor {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		storagecolor storagecolorObject = new storagecolor();
		System.out.println("What is your favorite color?"); 
		String color = input.nextLine();
		storagecolorObject.setColor(color);
		storagecolorObject.saying();	
	}
}
