package set;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stubu
		Queue q=new PriorityQueue();
		q.add(10);
		for (int i = 0; i < q.size(); i++) {
			System.out.println(q.poll());
			
		}
		

	}

}
