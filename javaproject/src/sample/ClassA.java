package sample;

public class ClassA {

		public int id1;
		public int id2;
		
		public void ClassB(int id1,int id2)
		{
			this.id1=id1;
			this.id2=id2;
		}
		public void display()
		{
			this.display2();
			System.out.println(this.id1);
			System.out.println(this.id2);
		}
       public void display2()
        {
    	   System.out.println("print details");
	    }
	}


