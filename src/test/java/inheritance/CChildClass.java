package inheritance;

public class CChildClass extends BParentClass
  {
	int a=50;
	static int b=60;
	public void m1()
	{
		BParentClass bb=new BParentClass();
		ASuperClass aa=new ASuperClass();
		System.out.println(a);//50
		System.out.println(b);//60
		System.out.println(ASuperClass.b);//20
		System.out.println(BParentClass.b);//40
		System.out.println(super.b);
		// when using super keyword previous parent class static variable call by default
		System.out.println(bb.a);//call previous parent class non static variable
		System.out.println(aa.a);// call supermost class non static variable
		
	}

	public static void main(String[] args) {
		CChildClass cc=new CChildClass();
		cc.m1();

	}

}
