
abstract class sample
 {

    public void display()	// method implementation
	{
	   System.out.println("saran");
	}
   abstract public void display1();	// method declaration
   abstract public void display2();	// method declaration
   abstract public void display3();	// method declaration

 }

class sample1 extends sample
  {
      public void display1()
	{
	  System.out.println("Abstract demo");
	}

	public void display2(){}

	public void display3(){}

  }

class demoabs
 {
   public static void main(String args[])
	{
	   sample1 obj=new sample1();
		obj.display();
		obj.display1();
	
	}
 }
