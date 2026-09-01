package CollegeSem5;
import java.util.*;

public class LabExcersice_8 {

	public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");
        map.put("Australia", "Canberra");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
