package sample;

import java.util.Iterator;
import java.util.Stack;


public class StackEg {

	public static void main(String[] args) {
		Stack <Integer> obj=new Stack <Integer> ();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.pop();
		obj.push(50);
		
		
		Iterator <Integer> itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
