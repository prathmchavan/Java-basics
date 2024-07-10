
//class A
//{
//	public void show()
//	{
//		System.out.println("in A show");
//	}
//	public void config()
//	{
//		System.out.println("in A config");
//	}
//}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}

class Calc 
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
}
class AdvCalc extends Calc
{   
    //in method overriding the method name , parameter and return type is same but the behaviour means the return types is different so it will basically overwrite the other add method from super class
	public int add(int n1, int n2)
	{
		return n1+n2+1;
	}
}


public class Override{
	public static void main(String args[])
	{
//		B obj=new B();
//		obj.show();
//		obj.config();
		
		AdvCalc obj=new AdvCalc();
		int r1=obj.add(3, 4);
		System.out.println(r1);
	}
}