package CollegeSem5;
import java.util.*;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "RANJANA";
		
		Map<Character,Integer> freqMap = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			freqMap.merge(ch,1,Integer::sum);
		}
		
		System.out.print(freqMap);
		
	}

}
