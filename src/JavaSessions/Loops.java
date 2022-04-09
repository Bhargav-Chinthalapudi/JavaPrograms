package JavaSessions;

public class Loops {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 50) {

			if (i % 5 == 0) {
				System.out.println(i);
			}
			++i;
		}
		
		// Taj Hotel
		boolean flag=false;
		while(flag) {
			System.out.println("welcome to Taj hotel"); // Unreachble code if condition is false always
		}
		
		System.out.println("Unreachdable code");
		
		// use cases
//		1. whenever you dont know the no of iterations - prefer while loop
//		2.amazon - total products - 1 to 100 , 1to200 etc
//		3.checking the element present on the web pages -- while loop
		 
		
//----------------- FOR LOOP---------------------------
//		1. when we are sure about total number of iterations
//		2. iterating Arrays and ArrayList
//		3. data driven - get the data from Excel sheet
		
		int p=1;
		for(;p<=10;) {// semi colons are mandate
			System.out.println();
			p++;
		}
		
//		for(;;) {
//			System.out.println("bye"); // Infinite loop
//		}
		char c='a';
		for(;c<='z';c++) {
			System.out.print((int)c+" "); // prints ASCII valuse
		}
		System.out.println();
		for(int q='A';q<='Z';q++) {
			System.out.print(q+" "); // prints ASCII valuse
		}
		
		for(double d=1.1;d<=10.0;d++) {
			System.out.println(d); // Build number example
		}
		System.out.println((char)'a'/'z');

//-------- do - while ---------------
//		1. pagination
		
		int r=1;
		do {
			System.out.println(r);
			r++;
			
		}while(r<=10);
//	loop with break
		
//		get the list of all footer links and then start loop and then check a condition 
//		if your consitin satisfies then break the loop

	}

}
