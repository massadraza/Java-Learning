// This lesson (Constructors) is associate with runage.java

public class storeage {
	private String ageNumber;
	
	public storeage(String age){
		ageNumber=age;
	}
	
	public void setAge(String age){
		ageNumber = age;			
	}
	public String getAge(){
		return ageNumber; 
	}
	public void saying(){
		System.out.printf("You are %s years old \n", getAge());
	}
}


