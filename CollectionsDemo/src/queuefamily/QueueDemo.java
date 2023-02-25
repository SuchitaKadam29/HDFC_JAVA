package queuefamily;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		PriorityQueue<String>  que = new PriorityQueue<String>();
		
			que.add("brown");
			que.add("adam");
			que.add("carry");
			que.add("ford");
			
			System.out.println(que);
			
			System.out.println("peek read data "+que.peek());
			
			System.out.println("poll delete data "+que.poll());
			
			System.out.println(que);
			
			
			
		Queue<Integer>  que2 = new PriorityQueue<Integer>();
			
			que2.add(55); //p4
			que2.add(22); //p2
			que2.add(88); // p3
			que2.add(11); //p1
			que2.add(55); //p5
		// 	que2.add(null); // not allowed
			
			System.out.println(que2);

	}

}
