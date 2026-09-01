package CollegeSem5;
import java.util.*;
import java.lang.*;

public class SumOfBeauty {
	
	public static int frequencyDiff(StringBuilder sb) {
		
		Map<Character,Integer> freqMap = new HashMap<>();
		
		for (int i = 0; i < sb.length(); i++) {
	        char c = sb.charAt(i);
	        freqMap.merge(c, 1, Integer::sum);
	    }
		
		
		int max = Collections.max(freqMap.values());
        int min = Collections.min(freqMap.values());
        //int difference = max - min;
        int count=0;
        
        
       
        
        if(count==1) {
        	return 0;
        }
        
        return max-min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "aabcb";
		StringBuilder sb = new StringBuilder(s);
		int count = 0;
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length()+1;j++) {
				StringBuilder test = new StringBuilder(sb.substring(i,j));
				
//				if (test.length()==1){
//					continue;
//				}
				count+= frequencyDiff(test);
				
				
			}
            
        }
		System.out.println(count);

	}

}
