package CollegeSem5;
import java.util.*;

public class LabExcersice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		int max = Collections.max(nums);
		int sum =0;
		for(int i:nums) {
			sum+=i;
		}
		
		System.out.println(nums);
		System.out.println(max);
		System.out.println(sum);
	}

}
