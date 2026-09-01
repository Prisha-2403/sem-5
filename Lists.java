package CollegeSem5;

import java.util.*;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		
		System.out.println(fruits.get(0));
		
		fruits.remove("Banana");
		
		System.out.println(fruits);

	}

}
