class A {

    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {

    public void show2() {
        System.out.println("in show B");
    }
}

public class Type {

    public static void main(String[] args) {
        // Example of primitive type casting (narrowing conversion)
        // double d = 4.5;
        // int i = (int) d;
        // System.out.println(i); // Outputs: 4

        // Example of creating an object of class A
        // A obj = new A();

        // Upcasting: Creating an object of class B and assigning it to a reference of class A
        // This is implicit and safe.
        // A obj = (A) new B(); 
        // obj.show1(); // Calls the show1 method from class A

        // Upcasting: Creating an object of class B and assigning it to a reference of class A
        A obj = new B();
        obj.show1(); // Calls the overridden show1 method from class B

        // Downcasting: Casting the reference of class A back to class B
        // This is explicit and must be done carefully.
        B obj1 = (B) obj;
        obj1.show2(); // Calls the show2 method from class B
    }
}
