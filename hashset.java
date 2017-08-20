import java.util.*;

class hashset
 {
    public static void main(String arf[])
	{
	       HashSet set=new HashSet();

		set.add("java");
		set.add("python");
		set.add("javascript");
		set.add("php");
		
		set.add("java");		// duplication of set 

		
		System.out.println(""+set.contains("java"));	//confirm whether the ele is available

//		set.clear();		// which is used to clear the hashset

		Iterator itr=set.iterator();

		while(itr.hasNext())
		{
	          System.out.println(""+itr.next());
		}
	}}

// which used to create a collection that uses a hash table for storage and use the mechanism called hashing 

// Contains only unique elements rather dupilicate element store in list | ArrayList







