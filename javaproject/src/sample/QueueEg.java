package sample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueEg {

	public static void main(String[] args) {
		/*PriorityQueue <Integer> pqueue=new PriorityQueue<Integer>();
		pqueue.add(10);
		pqueue.add(20);
		pqueue.add(30);
		//pqueue.add(null);
		//pqueue.add(null);
		
		System.out.println(pqueue.peek());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.peek());*/
		
		Deque <String> deque=new ArrayDeque <String>();
		deque.add("hai");
		deque.add("hello");
		
		for(String str:deque)
		{
			System.out.println(str);
		}
		deque.remove("hello");
		System.out.println("after removing");
		for(String str:deque)
		{
			System.out.println(str);
		}
	}

}
