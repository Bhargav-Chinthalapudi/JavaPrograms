package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		int i = 10;
		i = 20;
		System.out.println(i);

//	 Array 
//	 1. static Array -
		//size is fixed : extra memory and less memory and cant store different types of data
						
//	 and Dynamic Array - dynamic sized - collections - ArrayList

		int p[] = new int[2]; // every part is called a segment having index which starts from 0 called li -
								// lowesr index hi-highest index
		// p[3]=10;
		// p[4]=20;//ArrayIndexOutOfBoundExeception as size is defined till 2 values
		// onlys
		// System.out.println(p[4]);// Runtimeexception- ArrayIndexoutOfBoundException

//	 drawbacks
//	 unneccessary memeory allocation
//	 usecases - 1. where the data is fixed ex total no of days, no of categories in amazon, 

		double[] d = new double[2];
		d[0] = 12.33;
		d[1] = 100;// in double you cans store int also it will convert to 100.0

		for (double b : d) { //enhanced for loop
			System.out.println(b);

		}
		// char array
		char c[]=new char[2];
		//String array
		String names[]=new String[2];
		names[0]="mohit";
		names[1]="mohit";
		for(String s:names) {
			System.out.println(s);
		}
		
		// emp data : name(string), age(int),geneder(char),salary(double),isPrem(boolean)
		// Object Array
		//Object is inbuilt class in java - parent classes of all the classes
		Object empData[]=new Object[5];
		empData[0]="Lisa";
		empData[1]=30;
		empData[2]='F';
		empData[3]=34.55d;
		empData[4]=true;
		int count=0;
		for(Object e:empData) {
			System.out.println(count+"="+e);
			++count;
		}
		

	}

}
