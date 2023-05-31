package sample;

public class BuilderExample {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("ammu");
		s1.append("sudhi");
		System.out.println(s1);
		System.out.println(s1.reverse());
		System.out.println(s1.insert(3,"l"));
		System.out.println(s1.delete(2, 5));
	}

}
