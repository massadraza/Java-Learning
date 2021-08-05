class bank {
	public static void main(String[] args){
		double amount; 
		double principal = 350000;
		double apr = 0.0450000;
		
		System.out.println("This data is currently based upon a locked interest rate for the next 30 years. ");
		System.out.println("Your settings are listed below!");
		System.out.println("You have initially deposited $" + principal); 
		System.out.println("Your interest rate is " + apr*100 + "%");
		System.out.println("Here is the estimated amount of money expected over the next 30 years!");
		
		
		for(int year=1;year<=30;year++){
			amount=principal*Math.pow(1 + apr, year); 
			System.out.println(year + "     " + amount);
}
		System.out.println("Disclaimer: Locked interest rate may change due to an increase or decrease in pricing!");
}		
} 