package CollegeSem5;
import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> idk = new ArrayList<>();
		idk.add(7);
		idk.add(2);
		idk.add(9);
		idk.add(1);
		
		Collections.sort(idk);
		Collections.reverse(idk);
		
		System.out.println(Collections.max(idk));
		System.out.println(Collections.frequency(idk, 1));
		System.out.println(idk);

	}

}
