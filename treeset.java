import java.util.*;

class treeset
 {
    public static void main(String arf[])
	{
	       TreeSet set=new TreeSet();

		set.add("java");
		set.add("python");
		set.add("javascript");
		set.add("php");
		
		set.add("java");		// duplication of set 

		
		System.out.println(""+set.contains("struts"));	//confirm whether the ele is available

		Iterator itr=set.iterator();

		while(itr.hasNext())
		{
	          System.out.println(""+itr.next());
		}
	}}

// which used to create a collection that uses a tree structure table for storage 

// Contains only unique elements rather dupilicate element store in list | ArrayList




					


