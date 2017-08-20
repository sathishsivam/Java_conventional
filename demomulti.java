

class sample
 {
   
    sample(int m,int n)		// constructor
	{
	   int mul=m*n;
	   System.out.println("Multiplication="+mul);
	}
  }


class demomulti
 {
   public static void main(String args[])
	{
	   sample obj=new sample(10,10);
	   sample obj1=new sample(1,10);
	   sample obj3=new sample(3,10);
	}
 }

/*
constructor
		
	  which share the same name of the class
	  which is auomatically called during the creation of object
	  does not return any thing
*/


