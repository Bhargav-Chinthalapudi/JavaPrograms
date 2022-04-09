package JavaSessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		//1. ++ -- increment by 1
		
		int a=1;
		
		System.out.println(a);
		int b=a++;  // increase the value of a later
		System.out.println(a);
		System.out.println(b);
		
		int h=2;
		int g=++h;
		System.out.println(h);
		System.out.println(g);
		
		int n=3;
		
		System.out.println(n++);
		System.out.println(n);
		
		int f='a';
		System.out.println(f++);
		
		char b1='a';
		char b2='b';
		
		System.out.println(b1+""+b2); //ab
		System.out.println(""+b1+b2);
		
	}

}
