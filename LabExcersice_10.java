package CollegeSem5;
import java.util.*;

public class LabExcersice_10 {

	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Pen", 50);
        map.put("Book", 200);
        map.put("Bag", 700);
        map.put("Bottle", 150);
        map.put("Pencil", 20);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > 100) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }	

}
