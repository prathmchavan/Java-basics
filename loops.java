import java.util.Scanner;

class Loops {   
    public static void main(String[] args) {
        loop();

        // Create an instance of the Loops class to call the non-static method
        Loops obj = new Loops();
        System.out.println(obj.isTrue(8, 4));
    }

    public static void loop() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        System.out.println("You entered: " + c);
        sc.close();

        int[] nums = {1, 2, 4};
        for (int q = 0; q < nums.length; q++) {
            System.out.println(nums[q]);
        }

        int[] ages = {19, 20, 79, 10};
        int sum = 0;
        for (int x  : ages) {
            sum += x;
        }
        System.out.println("Sum of ages: " + sum);

        int[][] number = {{1, 2, 3}, {4, 5, 6}};
        for (int s = 0; s < number.length; s++) {
            for (int r = 0; r < number[s].length; r++) {
                System.out.println(number[s][r]);
            }
        }
    }

    public boolean isTrue(int k, int z) {
        if (k > z) {
            return true;
        } else {
            return false;
        }
    }
}
