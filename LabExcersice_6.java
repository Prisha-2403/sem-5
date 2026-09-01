package CollegeSem5;
import java.util.*;

public class LabExcersice_6 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");
        queue.offer("Task 4");

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

	}

}
