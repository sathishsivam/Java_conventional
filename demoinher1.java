
class sample	 		//super class
 {
    sample(int a,int b)
	{
	  int tot=a+b;
	  System.out.println(""+tot);
	}
 }

class sample1 extends sample 	// derived class
  {
     sample1(int x,int y,int z)
	{
	     super(x,y);		// calls the base class constructor
	    int mul =x*y*z;
	    System.out.println(""+mul);
	}
  }

class demoinher1
 {
   public static void main(String args[])
	{
           sample1 obj=new sample1(10,20,30);
	}
 }
 

// super is a key word which is used to call the super class constructor

// super keyword to be first statement of the derived class cons....

      