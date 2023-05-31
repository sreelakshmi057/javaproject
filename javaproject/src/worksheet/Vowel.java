package worksheet;
import java.util.*;
public class Vowel {

	public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	System.out.println("Enter character");
	char ch=read.next().charAt(0);
	
	switch(ch)
	{
	case'a':
		System.out.println("Vowel");
		break;
	case'e':
		System.out.println("Vowel");
		break;
	case'i':
		System.out.println("Vowel");
		break;
	case'o':
		System.out.println("Vowel");
		break;
	case'u':
		System.out.println("Vowel");
		break;
		default:
			System.out.println("Invalid");
	}

	}

}
