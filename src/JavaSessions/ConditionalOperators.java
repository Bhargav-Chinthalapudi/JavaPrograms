package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// == operator used to compare two primitive data types
		
		int a=10;
		int b=20;
		
		if(a==b) {
			System.out.println("both are equal");
		}
		
		
		boolean flag=true;
		if(flag) {
			
			System.out.println("pass");
		}
		else
			System.out.println("fail"); // dead code means it will never come inside else part
		
	
		int c=100;
		if(c<=100) {
			System.out.println("total is less than 100");
			if(c>=80) {
				System.out.println("greater than 80");
			
			if(c==80) {
				System.out.println("pass");
			}else
				System.out.println("fail");
			}
			else {
				System.out.println("NA");
			}
		} else
			System.out.println("BYE");

	
	
	String browser="chrome";
	
	if(browser.equals("chrome")) {
		System.out.println();
	}
}
}


