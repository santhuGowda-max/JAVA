package in.fundamentals;

public class Varible {
    //instance variable
	int data=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varible obj=new Varible();
        System.out.println(obj.data);	
        
        Varible obj2=new Varible();
        
        System.out.println("______________________________________");
        System.out.println("Before modifing the data");
        System.out.println(obj.data);        
        System.out.println(obj2.data);   
        System.out.println("after modifing the data");
        obj.data=500;
        System.out.println(obj.data);        
        System.out.println(obj2.data);
	}

}
