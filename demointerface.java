
interface a
  {
     public void display();
     public void get();
     final static int x=10;
   }

interface b extends a
  {
     public void display1();
   }

class sample implements b
  {
    public void show()
	{
	  System.out.println("From class");
	}

   public void display()
	{
	   System.out.println("value of "+x);
	}	
   public void display1()
	{
	   System.out.println("From interface2");
	}	

    public void get(){}	

  }

class demointerface
 {
   public static void main(String args[])
	{
	   sample obj=new sample();
		obj.show();
		obj.display();
		obj.display1();


	}
 }
