
class sample
 {
    public void display()
      {
	System.out.println("Empty method");
      }
 
   public void display(int x,int y)
      {
        int tot=x+y;
	System.out.println(""+tot);
      }

    public void display(String str1,String str2)
      {
	System.out.println("Name of the student"+str1);
	System.out.println("City of the student"+str2);
      }
 }

class demooverload
 {
    public static void main(String args[])
	{
	   sample obj=new sample();

		obj.display();
		obj.display(10,10);
		obj.display("Saran","eRODE");
	}
 }

 
