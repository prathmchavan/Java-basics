/*
 * Important Notes:
 * 
 * 1. Compile-time Polymorphism:
 *    - Also known as method overloading.
 *    - Defined and resolved at compile time.
 *    - Allows multiple methods in the same class with the same name but different parameters.
 *    - Example:
 *      public void display(int a) { ... }
 *      public void display(int a, int b) { ... }
 * 
 * 2. Run-time Polymorphism:
 *    - Also known as method overriding.
 *    - Defined and resolved at run time.
 *    - Allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
 *    - Example:
 *      class Parent {
 *          void show() { ... }
 *      }
 *      class Child extends Parent {
 *          @Override
 *          void show() { ... }
 *      }
 * 
 * 3. Polymorphism:
 *    - Refers to the ability of a method to exhibit different behaviors based on the object it is acting upon.
 *    - Helps in achieving flexibility and reusability in code.
 *    - Two types: compile-time polymorphism (overloading) and run-time polymorphism (overriding).
 */

class  A{

    public void show()
    {
        System.out.println("At A ");
    }
 
}

class  B extends  A{

public void show()
{
 System.out.println("at B");
}

}

 public  class  Polymor{

    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        obj = new B(); //here our obj is not pointing at B class so show method of of B class will execute this is called as run time ploymorphism
        obj.show();

    }
 }