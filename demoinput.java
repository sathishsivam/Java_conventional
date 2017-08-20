import java.io.*;

class sample
 {
    DataInputStream din=new DataInputStream(System.in); 
    int x,y;		
   
      public void display()
	{
	   try {
		 x=Integer.valueOf(din.readLine()).intValue();
		 y=Integer.parseInt(din.readLine());
		 float tot=x+y;
		System.out.println("Addition="+tot);
	       }catch(IOException d){}
	}
 }

class demoinput
  {
    public static void main(String args[])
	{
	  sample obj=new sample();
	   obj.display();
	}
   }
