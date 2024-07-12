class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class Exceptions {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        /* Important Notes:
         * For exception handling, we use try-catch blocks. It helps the program to continue running without terminating,
         * even if an exception occurs. The try block contains code that might throw an exception, 
         * and the catch block handles the exception, allowing the program to proceed further.
         * This is called runtime exception handling.
         */

        try {
            j = 18 / i;  // This operation might throw an ArithmeticException
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        System.out.println(j);
        System.out.println("Bye");

        int[] nums = new int[5];
        String str = null;

        try {
            j = 18 / i;  // This might throw an ArithmeticException
            System.out.println(str.length());  // This will throw a NullPointerException
            System.out.println(nums[1]);  // This is safe
            System.out.println(nums[5]);  // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit.");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        System.out.println(j);
        System.out.println("Bye");

        // throw keyword example
        try {
            j = 18 / i;  // This might throw an ArithmeticException
            if (j == 0) {
                // throw keyword is used to manually throw an exception
                throw new MyException("I don't want to print zero");
            }
        } catch (MyException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit.");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        System.out.println(j);
        System.out.println("Bye");
    }

    /* Important notes on exception hierarchy:
     * Error and Exception extend the Throwable class.
     * Throwable class is extended by the Object class.
     *
     * Error is divided into:
     * 1. Thread Death
     * 2. Virtual Machine Error (Out of memory)
     * 3. IO Error
     *
     * Exception is divided into:
     * 1. Runtime Exception (Unchecked Exception)
     *    - Arithmetic 
     *    - ArrayIndexOutOfBounds
     *    - NullPointer
     *    - It is your choice to handle or not
     * 2. SQL Exception (Checked Exception)
     *    - It is necessary to handle
     * 3. IO Exception (Checked Exception)
     *    - It is necessary to handle
     *
     * All about throw and throws:
     * - throw: Used to manually throw an exception.
     * - throws: Used in method signatures to declare the exceptions that the method can throw.
     */
}
