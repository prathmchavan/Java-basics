
class  Cons{

    public String name ;
    public int age ; 

    /*Important Notes:
     * Java by default provide the constructor if we did not mention any constructor we get it by the java behind the hood
     * there are two type of contructor basically like parameterized constructor and non parametric constructor 
     * we can create the constructor overloading by creating multiple constructor and changing the parameter for each constructor 
     * constructor get called when the object get created in main method of java program
     * constructor help to initialize the variable initial state or say object initial state
     */

     public Cons()
     {
        this.name= " ";
        this.age= 10;
     }


     public Cons(int age , String name)
     {
        this.name= name;
        this.age= age;
     }
    


}


public  class Construct{
    public static void main(String[] args) {
        
        Cons c = new Cons();
        /*Important notes:
         * if we try to print the varible without constructor we get null value try by commenting the above explicite constructor 
          
         */
        Cons d = new Cons(13 ,"tc"); // this object will use the parametric constructor

        System.out.println(c.age + " " + c.name);
        System.out.println(d.age + " " + d.name);


    }
}