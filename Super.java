
/**
// super()
class A //every class in java extend the object class
{
	public A() 
	{
		super(); //this super class calling the constructor of object class 
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
//		super(); //this will call the constructor of A class without non parametric constructor
		super(5); // this will call the constructor of A class of parametric constructor
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
		super(n);
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
		B obj=new B();
//		B obj=new B(5);
	}
}
**/


//this() 
class A
{ 
	public A()  //this
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		super(); //this is calling to the non parametric constructor of A class 
		System.out.println("in B");
	}
	public B(int n)
	{
		this();  //call constructor of same class ->B constructor non parametirc
		System.out.println("in B int");
	}
}
public class Super {
	public static void main(String[] args) 
	{
		
//		B obj=new B();
		B obj=new B(5);
	}
}

