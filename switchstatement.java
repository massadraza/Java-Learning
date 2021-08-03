class switchstatement {
	public static void main(String args[]) {
		int errorcode;
		errorcode = 0;
		
		switch (errorcode) {
		case 1:
			System.out.println("System Malfunction, Please Reboot");
			break;
		case 2:
			System.out.println("Overflow Error, Please Close Running Applications");
			break;
		case 3: 
			System.out.println("Unidentifed Software Detected In Operating System, Please Reset Computer"); 
			break;
		default: 
			System.out.println("Please Contact Customer Service For Further Assistance");
		break; 
		}
	}
}