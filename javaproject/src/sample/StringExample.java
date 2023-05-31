package sample;

public class StringExample {

	public static void main(String[] args) 
	{
     String s1="sreelakshmi  ";               
     System.out.println(s1.charAt(2));    //to get string at 2nd index
     System.out.println(s1.concat("unnithan")); //command to append in string class
     System.out.println(s1.length());  //to get length of string as set in s1,appended string is not stored in s1 to get the changed s1 we use string builder ans string buffer
     System.out.println(s1.indexOf("a"));  //index of a in s1
     System.out.println(s1.replace("s", "S")); //small s in s1 replaced with S
     System.out.println(s1.substring(2));     //to print from 2nd index
     System.out.println(s1.substring(2, 6));   //to print from 2nd index to 5th index
     System.out.println(s1.toLowerCase());     //to print in s1 in lower case
     System.out.println(s1.toUpperCase());     //to print s1 in uppercase
     System.out.println(s1.equals("sreelakshmi"));  //to check whether s1=entered string  
     System.out.println(s1.trim());               //to delete the spaces in the string "sreelakshmi   "
     System.out.println(s1.contains("k"));        //to check whether s1 contains entered string,"k"
     String sentence="name is ammu";                    //to split the words in a sentence and store them in seperate arrays,ie, name-1st array,is -2nd,name-3rd
     String[] arr=sentence.split(" ");  //to seperate words we can use space" "or";"-then put name;is;ammu where ;is there the words split,where " " splits
     for(String string:arr)
     {
    	 System.out.println(string);
     }
     String s="Hello";
    System.out.println(String.format("hi %s", s));  //to get the string s formatted with "hi" %s to format string %d to format integer     
	}

}
