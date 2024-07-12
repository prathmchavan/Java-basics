
interface  A{
    /*Important notes:
     * In interface basically every method are defined in interface are by default public abstract types
     */
    void show();
    void config();

    int age = 10; 
    //we can declare the variable in interface and those have the final and static property to it
    // so basically if it is static we directly use this variable in main method
    //it has final property cause interface do not have its own memory in heap it just create reference that is why it is final

}

interface  X {
    void run();
}

interface Y extends  X{
    //we can extend the interface 

}
class  B implements  A,Y
{
    /*Important notes:
     * we use implements keword to inherit the interface to class
     */
    
    public void show() {
        System.out.println("working show");
    }
    

    
    public void config() {
        System.out.println("working config");
    }

    public void run()
    {
        System.out.println("run from extended interface");
    }
}



public class  Interface {
    public static void main(String[] args) {

        B obj = new B();

        obj.show();
     
        obj.config();

        System.out.println(A.age);// we cabn directly use the variable from interface 


    }
}