
import java.io.*;

class sample
 {
    int x[][]=new int[3][3];
    DataInputStream din=new DataInputStream(System.in);

    public void get()
	{
	   for(int i=0;i<3;i++)
		{ 
		
	         try{
	  		    x[i]=Integer.valueOf(din.readLine()).intValue();
		    }catch(IOException d){}
		}
	}
	  
  }

class demoarr
 {
    public static void main(String args[])
	{
	   sample obj=new sample();
		obj.get();
	}
 }