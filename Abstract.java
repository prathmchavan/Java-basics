
// Abstract class Car defines the blueprint for all car objects
abstract class Car {

    // Abstract method to be implemented by subclasses
    public abstract void drive();

    // Concrete method that can be used as is or overridden by subclasses
    public void model() {
        System.out.println("model");
    }
}

// Class W extends the abstract class Car
// The class that extends an abstract class must implement all abstract methods
class W extends Car { //concreat class

    // Implementation of the abstract method drive
     
    public void drive() {
        System.out.println("driving");
    }
}

public class Abstract {

    public static void main(String[] args) {
        // Note: We cannot create an instance of an abstract class
        // Here, we are referencing the Car class and creating an object of the W class
        Car obj = new W();

        // Calling methods on the obj reference
        obj.drive(); // Calls the drive method implemented in W
        obj.model(); // Calls the model method inherited from Car

        // Additional notes:
        // 1. Abstract classes cannot be instantiated directly.
        // 2. A class inheriting an abstract class must implement all abstract methods, or it should be declared abstract itself.
        // 3. Abstract methods do not have a body; they are meant to be overridden in subclasses.
        // 4. Abstract classes can have both abstract and concrete methods.
        // 5. Use abstract classes when you want to provide a common base class with some shared functionality, and enforce certain method implementations in subclasses.
    }
}
