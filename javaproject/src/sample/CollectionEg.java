package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEg {

	public static void main(String[] args) {
		ArrayList list=new ArrayList(); //non generic
		list.add(1);
		list.add("Hello");
		list.add('c');
		list.add(5.4f);
		
		
		int a=(int) list.get(0);
		String b=(String) list.get(1);
		char c=(char) list.get(2);
		float d=(float) list.get(3);

		ArrayList<String> list1=new ArrayList<String>(); // generic
		list1.add("a");
		list1.add("c");
		list1.add("b");
		list1.add(null);
		list1.add(null);
		list1.add("a");
	
/*for (String i:list1)    //method1
{
	System.out.println(i);}
}*/
	Iterator<String> itr=list1.iterator();  //method 2
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

}
}