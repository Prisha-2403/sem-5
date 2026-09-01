package CollegeSem5;
import java.util.*;

public class LabExcersice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> frequency= new HashMap<>();
		StringBuilder word = new StringBuilder("engineering");
		
		
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			
			frequency.merge(c, 1, Integer::sum);
			
			
		}
		System.out.println(frequency);

	}

}
