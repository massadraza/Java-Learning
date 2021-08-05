import java.util.Scanner;


class gradebook {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double total = 0;
		double grade;
		double average; 
		double limit = 0;
		int authentication = 8183;
		
		
		
		if (authentication == 8183){
			while (limit < 1){
				System.out.println("Login Successful!");
				System.out.println("Please Enter Test Score (1)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 2){
				System.out.println("Please Enter Test Score (2)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 3){
				System.out.println("Please Enter Test Score (3)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 4){
				System.out.println("Please Enter Test Score (4)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 5){
				System.out.println("Please Enter Test Score (5)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 6){
				System.out.println("Please Enter Test Score (6)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 7){
				System.out.println("Please Enter Test Score (7)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 8){
				System.out.println("Please Enter Test Score (8)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 9){
				System.out.println("Please Enter Test Score (9)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
			}
			while (limit < 10){
				System.out.println("Please Enter Test Score (10)"); 
				grade = input.nextInt();
				total = total + grade; 
				limit++;
				System.out.println("Success!");
				
				average = total/10;
				
				System.out.println("The average of this student is " + average + "%");
				
				if(average < 60){
					System.out.println("This student failed!");
				}else{
					System.out.println("This student passed!");
				}
			}	
		}else{
			System.out.println("Unauthorized User Detected! Account Locked!"); 
		}
	}
}