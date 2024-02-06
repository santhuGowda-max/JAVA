package in.fundamentals;

public class Method_i {
       public static void m1() {
    	   System.out.println("static method executed");
       }
       public void m2() {
    	   System.out.println("non-static method executed");
       }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Method_i.m1();
       Method_i obj=new Method_i();
       obj.m2();
	}

}
