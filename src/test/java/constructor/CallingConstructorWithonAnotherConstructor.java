package constructor;

public class CallingConstructorWithonAnotherConstructor 
 {
	CallingConstructorWithonAnotherConstructor(double c)
	{
		
		System.out.println(" zero parameter constructor");
    }
	CallingConstructorWithonAnotherConstructor(boolean a)
	{
		this( 12.5);
		System.out.println(" boolean  parameter constructor");
	}
	CallingConstructorWithonAnotherConstructor(int b)
	{
		this(false);
		
		System.out.println(" int parameter constructor");
	}
//	CallingConstructorWithonAnotherConstructor(long g) this code not running when calling int code run 
//	{
//		this(12.6);
//		System.out.println(" long parameter constructor");
//	}
	
	public static void main(String[] args) {
		CallingConstructorWithonAnotherConstructor xyz=new CallingConstructorWithonAnotherConstructor (12.4);
		CallingConstructorWithonAnotherConstructor xyz1=new CallingConstructorWithonAnotherConstructor (true);
		CallingConstructorWithonAnotherConstructor xyz2=new CallingConstructorWithonAnotherConstructor (10);//int type
		//CallingConstructorWithonAnotherConstructor xyz3=new CallingConstructorWithonAnotherConstructor (100000000000);//long type 
	}

}
