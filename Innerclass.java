
class A {

    int age;

    public void show() {
        System.out.println("in outer class ");
    }
    public void anonymous() {
        System.out.println("in anonymous outer class ");
    }

    /*Important notes:
     * inner class can be implemented in other class 
     * we can use static keyword only for inner class to create instance of inner class object rather than creating reference of object of outer class
     */
    class B {

        public void some() {
            System.out.println("in inner class");
        }
    }

    static class C {

        public void another() {
            System.out.println("in static class");

        }
    }
}

abstract  class  AB{
//lets check that wil abstract class work with the anonymous class in main mehtod check the explanation
    abstract public void ab();
}

public class Innerclass {

    public static void main(String[] args) {

        A obj = new A();

        obj.show();
        /*Important notes:
         * the object of inner class can be created by refrencingh to the object of outer class 
         * another method is to make inner class static and then we can directly create object of the inner class eg A.B obj1 = new A.B();
         */
        A.B obj1 = obj.new B();

        obj1.some();
        A.C obj2 = new A.C();
        obj2.another();



        /*Important notes:
         * There is concept of anonymous inner class rather than creating the class inside and using the class keyword we can directly implement it in main method like below
         * i can also override the method using this like if  A class have anonymous class and now print run the code the blow override statement will get print if the class exist in that class so it basically override it.
         */

         A dir = new A(){

            public void anonymous()
            {
                System.out.println("i am at anonymous override class");
            }
         };


         dir.anonymous();


         /*Important notes: 
          * we can use the anonymous class to implement the abstract class abstract method  
           we use this anonumous class when we want to use the method or class once rather than writing multiple line we can do this using anonumous class
          */

          AB obj3 = new AB(){

            public void ab()
            {
                System.out.println("Abstract method and class working with the anonymous class");
            }
          };

          obj3.ab();

    }
}
