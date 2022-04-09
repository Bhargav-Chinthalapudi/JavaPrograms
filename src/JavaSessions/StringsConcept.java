package JavaSessions;

public class StringsConcept {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		double d1=12.33;
		double d2=13.42;
		System.out.println(a + b);
		System.out.println(a - b);
		
		String s="testing";
		String s2="selenium";
		 System.out.println(s+s2);
		 
		 System.out.println(a+s);
		 
		 System.out.println(a+b+s+s2);
		 System.out.println(s+a+b);
		 
		 System.out.println(s+(a+b));
		 
		 System.out.println("the value of a" + a);
		 System.out.println("the value of b" + b);
		 
		 System.out.println(s+a+b+d1+d2);
	
		 // range of char 
		 
		 char c1='a';
		 char c2='b';
		 char c3='E';
		 
		 System.out.println(c1+c2); //97+98
		 
//ASCII values		 a to b 97 to 122   A to Z 65 to 90   0 to 9 48 to 57
		 
		 System.out.println((int)c1);
		 
		 byte b1=120;
		 byte b2=123;
		 
		 int b3=b1+b2;
		 
		 System.out.println(10/2);
		 System.out.println(10/3);
		 System.out.println(10.0/3);
		// System.out.println(9/0); // exception arithmetic exception - for integers it will show arithmatic exception
		 //System.out.println(0/0); // arithmatic exception
		 
//		 System.out.println(0.0/0.0);  // NaN - not a number
//		 System.out.println(0.0/0); // NaN
		 System.out.println(9.0/0); // infinity - with double java behaviour is different
		 System.out.println(9.0/0.0); // infinity
		 
		 System.out.println(9%2); // % Modulus - gives remainder

	}

}
