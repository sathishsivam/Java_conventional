import java.util.*;  

public class dequeue 
 {  
   public static void main(String[] args) 
	{  
	   //Creating Deque and adding elements  
	
	   Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");    

		deque.offerFirst("sakthivel");

		deque.addLast("kisore");

		deque.removeFirst();
		deque.removeLast();
	
	   //Traversing elements  

		   for (String str : deque) 
			{  
			   System.out.println(str);  
	 	       }  

		deque.pollLast();

		   for (String str : deque) 
			{  
			   System.out.println(str);  
	 	       }  

	
        }  
}  