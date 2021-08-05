class gradefeedback {
	public static void main(String[] args){
		
		int grade = 81;
				
		
		if (grade < 60){
			System.out.println("You have failed!");
		}else{
			System.out.println("You have passed!");	
			if (grade > 80) {
				System.out.println("You have done a very good job!");
			}else {
				System.out.println("You haven't done the best but you can try better next time!");
			}
		}
	}
}