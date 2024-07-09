
public class  staticKeyword{
/*Important notes :
 * That is why we use the static keyword at main function 
 * if we remove the static we had to create the  instance of class to call the main method 
 * but our main method is the starting point of the program so it will get creat a deadlock 
 * so we use static keyword so it does not have to depend on the class to call it
 * By marking the main method as static, the JVM can call it directly using the class name. This simplifies the process of starting the program.
 * For example, the JVM can directly invoke ClassName.main(args) without needing to create an object of ClassName.
 */
    public static void main(String[] args) {
    
        test obj1=new test();
		obj1.brand="Apple";
		obj1.price=1500;
		//obj1.name="SmartPhone";
		test.name="SmartPhone";
		
		test obj2=new test();
		obj2.brand="Samsung";
		obj2.price=1700;
		//obj2.name="SmartPhone";
		test.name="SmartPhone";
		
		//obj1.name="Phone";
		test.name="SmartPhone";
		
		obj1.show();
		obj2.show(); // non static method 
		
        /*Important notes:
         * we are directly calling the method without creating object instace of the class 
         */
		test.show1(obj1); // static method 
		
		//System.out.println(obj1.brand);

        /*Important notes
         * if i update the staic variable i will get reflected in every object , it means same for all 
         */
      
        
        

        

    }
    

}

class  test{

    String brand;
	int price;

	static String name;
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	public static void show1(test obj)
	{ 
        /*Important notes:
         * we can't pass non static variable directly to static method but indirectly can pass those vaiable
         * like passing the object instace of the non static variable to the static method 
         */
//		System.out.println("in static method");
		System.out.println(obj.brand+" : "+ obj.price +" : "+test.name);
	}


    static {
		name="Phone";
		System.out.println("in static block");
	}
	
    /*Important notes:
     * lets we are creating the constructor and we are creating initial values for the variable and we are calling the constructor when we intantiat the obje of class so every time we are creating name vriable
     * but our name variable is static it is same for all so we should initialize onece here the static block concept comes in
     * the static block get called when the class get loads
     * rather we change the sequence of constructor or static block but static block get called first
     * when java program runs the class loader rund then object get intantiated so when class loads the static block get called and when object instance get created the constructor get called
     */
	public test() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}


    

}