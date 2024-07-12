
enum Status {
    /*Important notes:
     * In Java, everything is a class, so Status is a class, and the below Running, Failed, Pending, Success are
     * instances (constants) of the Status enum. We can directly access them in the main method.
     * We can't extend the enum class 
     */
    Running, Failed, Pending, Success;
}


enum  Laptop{


    /*Imporatant notes 
     * we can create constructor and getter and setter method for enum class 
     * as well as we can use defualt constructor if we don't want to set price of any laptop
     * 
     */
    macbook(2000), ideapad(400), thinkpad(800),ace();

    private  Laptop()
    {
        this.price=900;
    }

   private   int price;
    private Laptop(int price) {

        this.price = price;
    }   

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    

}

public class Enum { // Renamed class to avoid conflict with java.lang.Enum

    public static void main(String[] args) {

        // Example of using enum values
        Status[] ss = Status.values(); // Get all values of the enum
        System.out.println("All Status values:");

        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal()); // Print each value and its ordinal
        }

        // Using a specific enum value in a switch statement
        Status s = Status.Failed;
        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Success:
                System.out.println("Done");
                break;
        }

        // Using a specific enum value in an if-else statement
        if (s == Status.Running) {
            System.out.println("All Good");
        } else if (s == Status.Failed) {
            System.out.println("Try Again");
        } else if (s == Status.Pending) {
            System.out.println("Please Wait");
        } else {
            System.out.println("Done");
        }



        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap +":"+lap.getPrice());
        }
    }

}
