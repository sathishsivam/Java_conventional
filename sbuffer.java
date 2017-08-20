
class sbuffer
  {
      public static void main(String args[])
	{

	/*StringBuffer sb=new StringBuffer("Hello ");  		//mutable
	sb.append("Java");//now original string is changed  
	System.out.println(sb);//prints Hello Java  

	String sb1=new String("Hello ");  			// im mutable
	sb1.concat("Java");//now original string is changed  
	System.out.println(sb1);//prints Hello Java  */

	StringBuffer sb=new StringBuffer("Hello ");  
	sb.insert(1,"Java");//now original string is changed  
	System.out.println(sb);//prints HJavaello  */

	StringBuffer sb=new StringBuffer("Hello");  
	sb.replace(1,4,"Java");  
	System.out.println(sb);//prints HJavalo  */

	StringBuffer sb=new StringBuffer("Hello");  
	sb.delete(1,3);  
	System.out.println(sb);//prints Hlo  


	StringBuffer sb=new StringBuffer("saran");  
	sb.reverse();  
	System.out.println(sb);//prints olleH 

	StringBuffer sb=new StringBuffer();  
	System.out.println(sb.capacity());//default 16  
	sb.append("Hello");  
	sb.append("Hi");  

	System.out.println(sb.capacity());//now 16  
	sb.append("java is my favourite language");  

	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  */

    }
 }
	
