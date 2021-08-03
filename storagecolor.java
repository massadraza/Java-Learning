
public class storagecolor {
	private String colorName;
	public void setColor(String name) {
		colorName=name;
	}
	public String getName(){
		return colorName; 
	}
	public void saying(){
		System.out.printf("Your favorite color is %s", getName());
	}
}
