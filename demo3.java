
class sample
   {
     int x=100,y=100;	// global declaration

     public void display()
	{
	  int sum=x+y;	//local declaration
	  System.out.println("Summation value="+sum);
	}

     public void display1()
	{
	 sum=100;
	}
	
   }

class demo3
  {
    public static void main(String args[])
	{
	  sample obj=new sample();
	  obj.display();
	}
   }
     