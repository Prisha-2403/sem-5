package CollegeSem5;

import java.util.*;


public class LabExcersice_3 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(5);
		nums.add(5);
		
		for(int i=1;i<nums.size();) {
			if(nums.get(i) == nums.get(i-1)) {
				nums.remove(i);
			}
			else {
				i++;
			}
		}
		
		
		System.out.println(nums);
		

	}

}
