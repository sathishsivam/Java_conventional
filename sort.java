import java.util.*; 

class sort
{  
	public static void main(String args[])
	{  
  
		ArrayList<String> al=new ArrayList<String>();  

			al.add("1");  
			al.add("12");  
			al.add("5");  
			al.add("3");  
			al.add("4");  
			al.add("9");  
			al.add("2");  
 
			Collections.sort(al);  

			Iterator itr=al.iterator();  

			while(itr.hasNext())
			{  
				System.out.println(itr.next());  
	
 			}  
	}  
}  