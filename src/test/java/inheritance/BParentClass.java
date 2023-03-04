package inheritance;

public class BParentClass extends ASuperClass
  {
	int a=30;
	static int  b=40;
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(ASuperClass.b);// call static variable from super class
		ASuperClass aa=new ASuperClass();
		System.out.println(aa.a);//call non static variable from super class
	}

	public static void main(String[] args) {
		BParentClass bb=new BParentClass();
		bb.m1();

	}

}
