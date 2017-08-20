
class sample
  {
    int x,y,tot;	// variable declaration

    public int saran()	// method
	{
	  tot=x+y;
	  return tot;
	}
  }

class demo5
 {
    static public void main(String args[])	// main method
	{
	  sample obj=new sample();
	  int tot=obj.saran();
	  System.out.println(""+tot);
	}	
 }