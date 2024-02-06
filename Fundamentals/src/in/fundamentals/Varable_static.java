package in.fundamentals;

public class Varable_static {
   static int data=500;
	public static void main(String[] args) {
	
      //Using the class name
		System.out.println(Varable_static.data);
		
	    // Using the object name
		Varable_static obj1=new Varable_static();
		System.out.println(obj1.data);
		
		Varable_static obj2=new Varable_static();
		
		System.out.println("_________________________");
		System.out.println("Before modifying data ");
		System.out.println(obj1.data);
		System.out.println(obj2.data);
		System.out.println("_________________________");
		System.out.println("After modifying data ");
		obj1.data=1000;
		System.out.println(obj1.data);
		System.out.println(obj2.data);
	}

}
