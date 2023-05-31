package sample;

import java.util.Iterator;
import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		Vector <Integer> obj=new Vector <Integer> ();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		Iterator <Integer> itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
