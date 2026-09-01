package CollegeSem5;
import java.util.*;

public class Maps {

	public static void main(String[] args) {
		
		Map<String,Integer> data = new HashMap<>();
		
		data.put("Shivansh",100);
		data.put("Krishna", 92);
		data.put("Aryan", 0);
		
		data.put("Shivansh",99);
		System.out.println(data.get("Aryan"));
		
		System.out.println(data);
		
	}

}
