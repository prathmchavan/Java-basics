
@FunctionalInterface
interface  A{
    /*Imporatnt notes
     * we can specific using @functionainterface annotation to tell java compiler that this is functional interface now we can't define more than one method in it
     */
    void show();

}


class  B implements  A{

    public void show()
    {
        /*Important notes:
         * we can implement the interface to the class and define the method and run it in main function by creating the object but rather than writing the whole class we can use inner class in main method and directly write the method 
         */
        System.out.println("show");
    }
}

public  class  InterTypes{
    public static void main(String[] args) {

        //We can directly use inner class to define the method of interface if there is only one method
        //the functional interface are the interface which have only one method in it 
        // marker interface are the interface which do not have any method 
        // normal interface means it can have more than one method in it
        A obj = new A(){
            public void show()
            {
                System.out.println("working in inner class");
            }
        };

        obj.show();
    }
}