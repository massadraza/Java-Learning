class logicaloperators {
	public static void main(String args[]) {
		int user_age, computer_age;
		user_age = 17;
		computer_age = 4; 
		
		if(user_age > 18 || computer_age < 5) {
			System.out.println("You are eligible for this new update!");
		}else{
			System.out.println("You are not eligible for this new update. Please upgrade your hardware!");
		}
	}
}