class sample		// super class
  {
    public void display()
	{
	  System.out.println("sathish");
	}
 }

class sample1 extends sample	// derived class
   {
     public void display()
	{
	  System.out.println("saran");
	}
    }

class demoover
  {
    public static void main(String args[])
	{
	   sample ref;	// reference variable
	   sample obj=new sample();	// super class object
	   sample1 obj1=new sample1();	// derived class object

   	   ref=obj;
	   ref.display();	// calls super class version

	   ref=obj1;
	   ref.display();
	}
   }

/* method in the derived class share the same name and type signature of the method
in the base class we call that the method in the derived class overrides the 
method in the base class*/
