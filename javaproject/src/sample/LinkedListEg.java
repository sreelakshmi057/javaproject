package sample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
	LinkedList <String> list=new LinkedList<String>();
	list.add("Ammu");
	list.add("sudhi");
	list.add("akhil");
	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	}

}
