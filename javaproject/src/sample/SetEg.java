package sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		/*HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();  //maintains insertion order
		set.add("Ravi1");  
		set.add("Vijay2");  
		set.add("Ravi3");  
		set.add("Ajay4");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} */
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  //duplicate not allowed so not printed in output and printed in ascending order
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  

	}

}
