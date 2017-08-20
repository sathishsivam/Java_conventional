import java.util.*;


class linked
  {
    public static void main(String args[])
	{
	  LinkedList<String> l1=new LinkedList<String>();

	  l1.add("salem");
	  l1.add("Erode");
	  l1.add("Coimbatore");
	  l1.add("pallakad");
	  l1.add("trisur");
	  l1.add("Ernakulam");
	  l1.add("Ernakulam");




	
		l1.addFirst("Nellai");
		

		l1.addFirst("salem");
		
		l1.addFirst("Madurai");
			
		l1.addFirst("Trichy");

		System.out.println(""+l1.size());		
	
		System.out.println("My first object element"+l1.getFirst());		


		l1.addLast("Cudalore");

		System.out.println("Received at position2="+l1.get(2));

		l1.set(5,"Dharmapuri");

	
		l1.push("Villupuram");	


	  Iterator itr=l1.iterator();

		while(itr.hasNext())
		{
	           System.out.println(itr.next());
		}
           }
   }
 



