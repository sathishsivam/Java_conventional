import java.io.*;

class sample
 {
    int x[][]=new int[3][3];
    int y[][]=new int[3][3];
    int tot[][]=new int[3][3];

	
   DataInputStream din=new DataInputStream(System.in);
	
   public void getdata()
	{
          System.out.println("Enter the Matrix A");
	   for(int i=0;i<3;i++)
	     {
	       for(int j=0;j<3;j++)
		 {
	          try{
	 	   x[i][j]=Integer.valueOf(din.readLine()).intValue();
	    	   }catch(IOException d){}
		 }
             }
         }

   public void getdata1()
	{
          System.out.println("Enter the Matrix B");
	   for(int i=0;i<3;i++)
	     {
	       for(int j=0;j<3;j++)
		 {
	          try{
	 	   y[i][j]=Integer.valueOf(din.readLine()).intValue();
	    	   }catch(IOException d){}
		 }
             }
         }

   public void summ()
	{
	   for(int i=0;i<3;i++)
	     {
	       for(int j=0;j<3;j++)
		 {
			tot[i][j]=x[i][j]+y[i][j];
		 }
             }
          } 
   public void display()
	{
          System.out.println("Enter the Matrix B");
	   for(int i=0;i<3;i++)
	     {
	       for(int j=0;j<3;j++)
		 {
	 	   System.out.print(""+tot[i][j]);
		 }
		System.out.println("");
             }

         }

   }

class demoarr1
  {
    public static void main(String args[])
	{
	  sample obj=new sample();
		obj.getdata();
		obj.getdata1();
		obj.summ();
		obj.display();
	}
 }