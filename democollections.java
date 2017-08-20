import java.util.*;

public class democollections
{

   public static void main(String[] args) 
{
      // ArrayList 
      List a1 = new ArrayList();
      a1.add("sivam");
      a1.add("sathish");
      a1.add("saran");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

      // LinkedList
      List l1 = new LinkedList();
      l1.add("sivam");
      l1.add("sathish");
      l1.add("saran");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      // HashSet
      Set s1 = new HashSet(); 
      s1.add("sivam");
      s1.add("sathish");
      s1.add("saran");
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);

      // HashMap
      Map m1 = new HashMap(); 
      m1.put("sivam", "8");
      m1.put("sathish", "31");
      m1.put("saran", "12");
      m1.put("jeeva", "14");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
   }
}