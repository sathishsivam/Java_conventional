import pack.*;


class samplee extends mypack
 {
    public void show()
	{
	  System.out.println("Accessing");
	}
 }

class demopack
 {
    public static void main(String args[])
	{
	  samplee obj=new samplee();
		obj.show();
		System.out.println(""+obj.display(2,2));
	}
 }	   

