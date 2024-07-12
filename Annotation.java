@Deprecated
class A {
    // This method belongs to class A and is marked as deprecated
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in show A");
    }
}

class B extends A {
    @java.lang.Override
    public void showTheDataWhichBelongsToThisClass() {
        // This method overrides the method from class A
        System.out.println("in show B");
    }
}

public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass(); // This will call the overridden method in class B
    }
}
