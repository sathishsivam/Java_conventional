import java.util.*;  

class TestCollection1
 {  
  public static void main(String args[])
   {  
  	ArrayList <String> list=new ArrayList<String>();//Creating arraylist  

		  list.add("1");//Adding object in arraylist  
		  list.add("2");  
		  list.add("3");  
		  list.add("4");  
		  list.add("5");  
		  list.add("6");  
		  list.add("7");  
		  list.add("3");  

	
		System.out.println("Element @ position 2="+list.get(2));
	
	  //Traversing list through Iterator  
		
	 Iterator itr=list.iterator();  

	  while(itr.hasNext())
		{  
		   System.out.println(itr.next());  
		  }  
	 }  
}  

/*
hasNext()

	returns true if the list iterator has more elements when traversing the list in fwd direction

next()
		returns the next element in the list and advance the cursor position 

*/
