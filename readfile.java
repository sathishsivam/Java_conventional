import java.util.*;  
import java.io.*;  

public readfile 
{  
 public static void main(String[] args)throws Exception
   {  
    FileReader reader=new FileReader("user.properties");  
      
	    Properties p=new Properties();  
		    p.load(reader);  
      
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}  
 }  