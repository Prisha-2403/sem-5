package CollegeSem5;
import java.util.*;

public class LabExcersice_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Character> stack = new ArrayDeque<>();

        String str = "HELLO";

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
	}

}
