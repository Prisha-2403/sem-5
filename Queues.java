package CollegeSem5;
import java.util.*;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q = new LinkedList<>();
		
		q.offer("Shivansh");
		q.offer("Krishna");
		
		System.out.println(q.poll());
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.push(1);
		dq.push(2);
		
		System.out.println(dq.pop());
	}

}
