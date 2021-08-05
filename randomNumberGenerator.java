import java.util.Random;

class randomNumberGenerator {
	public static void main(String[] args) {
		Random number = new Random();
		int Number;
		int Position = 15; 
		
		for(int counter=0; counter<=0; counter++) {
			Number = 1+number.nextInt(10);
			System.out.println("Your place in line is " + Number);
			System.out.println("Keep In Mind That There Are a Total of " + Position + " People In Line");
			
		}
	}
}
