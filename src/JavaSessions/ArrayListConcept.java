package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
//		ArrayList - default or inBuilt class in java
//		Index based - maintains the order
//		duplicates also you can store in arraylist
		
		ArrayList<Integer> ar=new ArrayList<Integer>();// By default 10 segments will be created
		System.out.println(ar.size()); //you will get zero as it will check physical capacity
//		ArrayList ar=new ArrayList(20);//  20 segments will be created
		ar.add(100);
		ar.add(200);
//		System.out.println(ar.size());//2
		ar.add(300);
//		System.out.println(ar.size());//3
		ar.remove(0);//size will be adjusted as list is dynamic
		System.out.println(ar.size());//2
		System.out.println(ar.get(0));
//		AR - emp data 
		ArrayList<Object> empData=new ArrayList<Object>();// stores different types of data as object is superclass of all classes in java
		empData.add("bhargav");
		empData.add(20);
		
		for(int i=0;i<empData.size();i++) {
			System.out.println(empData.get(i));
			if(empData.get(i).equals("bhargav")) {
				System.out.println("Emp name is bhargav");
				break;
			}
		}
		
//		use cases in selenium
//		1. 10 links on page
//		 collect all links
//		 start a loop
			// if(ele.text().equals(amazon))
				//click();
				//break;
//		2. drop down selection
	}

}
