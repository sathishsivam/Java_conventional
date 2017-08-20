	import java.util.*;  

	class queue
	{  
		public static void main(String args[])
		{  
			PriorityQueue<String> queue=new PriorityQueue<String>();  

				queue.add("saran");  
				queue.add("sathish");  
				queue.add("jeeva");  
				queue.add("aswin");  
				queue.add("x");
				queue.add("y");
				queue.add("Balu");
								

				queue.offer("sivam");  
				queue.offer("sakthivel");  



/*		
//		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		
		System.out.println("iterating the queue elements:");  */
		

				Iterator itr=queue.iterator();  
				while(itr.hasNext())
				{  
					System.out.println(itr.next());  
				}  
		
//				queue.remove(); 


//			System.out.println("after removing  elements:");  

/*			Iterator<String> itr2=queue.iterator();  
				while(itr2.hasNext())
				{  
				System.out.println(itr2.next());  
				}   */
		}  
	}  




