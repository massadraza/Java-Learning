// Creating an Array Table
// \t means tab (5 spaces)
class ArrayTable {
	public static void main(String[] args){
		System.out.println("Student ID \t Avg. Grade");
		int testScores[] = {80,99,100,52,68,79,89,90};
		
		for(int counter=0;counter<testScores.length;counter++){
			System.out.println(counter + "\t \t \t" + testScores[counter]);
			
			
		}
	}
}
