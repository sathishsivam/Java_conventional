public class Box<T> 
 {
   private T x,y;

   public void add(T t, T y) 
	{
	      this.t = t;
        }

   public T get() {
      return t;
   }


   public static void main(String[] args) 
	{
	      Box<Integer> integerBox = new Box<Integer>();
	      Box<String> stringBox = new Box<String>();
	      Box<Float> floatBox = new Box<Float>();

        		  integerBox.add(new Integer(10));
	          stringBox.add(new String("Hello World"));
	          floatBox.add(new Float(2));

	      System.out.printf("Integer Value :%d\n\n", integerBox.get());
	      System.out.printf("String Value :%s\n", stringBox.get());
	      System.out.printf("Float Value :%f\n", floatBox.get());

       }
}
		
/*public class Box<T>
 {
   T x,y;

   public void add(T x, T y) 
	{
	      this.t = t;
        }

   public int get() {
      return t;
   }
*/