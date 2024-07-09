
import java.util.Scanner;


public class test {

  
    public static void main(String[] args) {
        System.err.println("working with me");

        String name;

        name = " prathmes";

        System.err.println(name);
        name("passing the arg to the name method");
    }

    public static void name(String name) {
        System.out.println(name);

        add(2, 4);

    }

    public static void add(int a, int b) {
        int c = a + b;

        System.out.println("\nthe addition of two variable is :" + c);
        fizzbuzz();
    }

    public static void fizzbuzz()
    {
        for (int i = 0; i < 100; i++) {
            
            if( i % 3 == 0 && i % 5 == 0 )
            {   
                System.out.println("fizzubuzz");
            }  
            else if(i % 3 == 0)
            {
                System.out.println("fizz");
            }
            else if( i % 5 == 0)
            {
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
          
        }

        loop();
    }

    // while loop

    public static void loop()
    {
        int i = 0 ;
        while(i<=10){
            
            System.out.println(i);
            i++;
        }

            // int j =10;
        // do { 
        //     System.err.println(j);
        //     i--;
        // } while (j>0);


        //how to take input from the user
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        System.err.println(c);


    

        int [] nums = {1 , 2,4};
        
        for(int q=0 ; q< nums.length; q++) {
            System.err.println(nums[q]);
        }


        


    }


}




