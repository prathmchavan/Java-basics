class string{

    public static void main(String[] args) {
        
        String name = "pc";
        String pc = "pc";
        String newPc = new String("pc");

        // Checking if 'name' and 'pc' refer to the same object in the string pool
        if (name == pc) {
            System.out.println("name and pc refer to the same object in the string pool");
        } else {
            System.out.println("name and pc refer to different objects");
        }


        /*Important notes :
         * normal string are immutable if the values are same it just point to that string which already exist in string constant pool it won't create new data inside the heap memory , it just point the address of the location
         */
        // Printing memory address (hash code) of 'name' and 'pc'
        System.out.println("Memory address of name: " + System.identityHashCode(name));
        System.out.println("Memory address of pc: " + System.identityHashCode(pc));

        // Comparing string with 'new String()' to demonstrate different memory address
        if (name == newPc) {
            System.out.println("name and newPc refer to the same object");
        } else {
            System.out.println("name and newPc refer to different objects");
        }

        // Printing memory address (hash code) of 'newPc'
        System.out.println("Memory address of newPc: " + System.identityHashCode(newPc));
    }
}

/* Important notes : 
 
all about the string buffer , string is immutable cannot be changed once after get create but in in term of string buffer we can change or update the data once it get created it offer us more advance feature like update , delete the character and many more without creating extra object of the string

 */

 class StringBufferExample {
    
    public static void any(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Appending text to the StringBuffer
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // Inserting text at a specific position
        sb.insert(6, "Java ");
        System.out.println(sb); // Output: Hello Java World

        // Reversing the content of the StringBuffer
        sb.reverse();
        System.out.println(sb); // Output: dlroW avaJ olleH

        // Deleting a portion of the content
        sb.delete(0, 6);
        System.out.println(sb); // Output: avaJ olleH

        // Replacing a portion of the content
        sb.replace(0, 4, "Hi");
        System.out.println(sb); // Output: Hi olleH
    }
}
