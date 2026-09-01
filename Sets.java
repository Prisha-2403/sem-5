package CollegeSem5;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(10);
		
		System.out.println(s);
		
		Set<Integer> sorted = new TreeSet<>(s);
		
		System.out.println(sorted);
		
		
		
		
		
		
	}

}
