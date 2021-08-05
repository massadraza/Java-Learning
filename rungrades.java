
public class rungrades {
	private String gradeNumber;
	
	public void runPrinter(String grade){
		gradeNumber=grade;
	}
	public String getGrade(){
		return gradeNumber;
	}
	public void gradeprint(){
		if (Integer.parseInt(gradeNumber) > 100)
			System.out.println("Invalid Score Error! Score cannot be greater than 100%!");
		else if (Integer.parseInt(gradeNumber) == 100) 
			System.out.printf("You have a perfect score!");
		else if (Integer.parseInt(gradeNumber) >= 90)
			System.out.printf("You have a great score!");
		else if (Integer.parseInt(gradeNumber) >= 80)
			System.out.printf("You have an average score!");
		else if (Integer.parseInt(gradeNumber) < 80)
			System.out.printf("You have failed this assessment! Please contact your teacher to retake this assessment!");
	}
}
