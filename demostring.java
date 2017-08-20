
class sample
 {
    String str="   saran   " ;

    public void display()
	{

	
          /* System.out.println(""+str);			// String concat
	   System.out.println(""+str.concat("Tamilnadu"));	

	   int len=str.length();
	   System.out.println(""+len);

	   String t=str.trim();					// String trim
	   System.out.println(""+t);*/

/*	   String s1="Saran";  
	   String s2="SarAn";  
	   String s3="Saran";  
	   String s4="Saurav";  
	   System.out.println(s1.equalsIgnoreCase(s2));//true  
	   System.out.println(s1.equals(s3));//true  
	   System.out.println(s1.equals(s4));//false  */

/*	   String s1="Saran";  
	   String s2="Saran";  
	   String s3=new String("Saran");  
	   String s4=new String("Saran");  
	
	   System.out.println(s1==s2);//true (because both refer to same instance)  
	   System.out.println(s4==s3);//false(because s3 refers to instance created in nonpool)  */

	// compareTo()

	   String s1="Saran";  
	   String s2="Saran";  
	   String s3="RAtan";  
	   System.out.println(s1.compareTo(s2));//0  
	   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
	   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  

/*	   String s="SaranTendulkar";  
	   System.out.println(s.substring(5));//Tendulkar  
	   System.out.println(s.substring(0,6));//Saran  */


/*	   String s="Saran";  
  	   System.out.println(s.startsWith("Sa"));//true  
   	   System.out.println(s.endsWith("n"));//true  */


/*	String s="Saran";  
	System.out.println(s.charAt(0));//S  
	System.out.println(s.charAt(3));//h  */

	String s=new String("Saran");  
	String s22=s.intern();  
	System.out.println(s22);//Saran  

	String s11="Java is a programming language. Java is a platform. Java is an atmosphere.";    
	String replaceString=s11.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
	System.out.println(replaceString);    

	// StringBuffer Demo


/*	StringBuffer sb=new StringBuffer("Hello ");  		//mutable
	sb.append("Java");//now original string is changed  
	System.out.println(sb);//prints Hello Java  

	String sb1=new String("Hello ");  			// im mutable
	sb1.concat("Java");//now original string is changed  
	System.out.println(sb1);//prints Hello Java  */

/*	StringBuffer sb=new StringBuffer("Hello ");  
	sb.insert(1,"Java");//now original string is changed  
	System.out.println(sb);//prints HJavaello  */

/*	StringBuffer sb=new StringBuffer("Hello");  
	sb.replace(1,4,"Java");  
	System.out.println(sb);//prints HJavalo  */

/*	StringBuffer sb=new StringBuffer("Hello");  
	sb.delete(1,3);  
	System.out.println(sb);//prints Hlo  */


/*	StringBuffer sb=new StringBuffer("saran");  
	sb.reverse();  
	System.out.println(sb);//prints olleH  */

	StringBuffer sb=new StringBuffer();  
	System.out.println(sb.capacity());//default 16  
	sb.append("Hello");  
	sb.append("Hi");  

	System.out.println(sb.capacity());//now 16  
	sb.append("java is my favourite language");  

	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  


	}
 }

class demostring
 {
    public static void main(String args[])
	{
	   sample obj=new sample();
	   obj.display();
	}
 }