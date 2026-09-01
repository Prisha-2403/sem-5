package CollegeSem5;
import java.util.*;

public class findJudge {
	
	public int findJudge(int n, int[][] trust) {

        Map<Integer,Integer> person = new HashMap<>();
	
		
		int maxKey = -1; 
        int maxValue = Integer.MIN_VALUE;
		
		for(int[] a: trust) {
			int judge = a[1];
			
			
			person.merge(judge, 1, Integer::sum);
			
		}
		
		for(int[] a:trust) {
			int victim = a[0];
			person.put(victim, 0);
			
		}
		
		
		
		for (Map.Entry<Integer, Integer> entry : person.entrySet()) {
            if (entry.getValue() > maxValue && entry.getValue() >0) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        if(n==1){
            return 1;
        }
		
		
		if (maxValue == n-1) {
            return maxKey;
        } else {
            return -1;
        }

        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
