
class sample
  {
     int x,y;	

     public void display(int x,int y)
	{
	   this.x=x;
	   this.y=y;
	}

     public void show()
	{
	   System.out.println(""+x);
	   System.out.println(""+y);
	}
		
   }


class demothis
  {
     public static void main(String args[])
	{
	    sample obj=new sample();
		obj.display(10,10);
	        obj.show();
	}
  }
