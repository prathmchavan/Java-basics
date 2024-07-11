import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        // Example of max(Collection c):
        List<Integer> numbers = new ArrayList<>(List.of(3, 1, 7, 4, 2));
        Integer maxElement = Collections.max(numbers);
        System.out.println("Max element in numbers: " + maxElement); // Outputs: Max element in numbers: 7
        
        // Example of min(Collection c):
        Integer minElement = Collections.min(numbers);
        System.out.println("Min element in numbers: " + minElement); // Outputs: Min element in numbers: 1
        
        // Example of reverse(List list):
        System.out.println("Original list: " + numbers); // Outputs: Original list: [3, 1, 7, 4, 2]
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers); // Outputs: Reversed list: [2, 4, 7, 1, 3]
        
        // Example of shuffle(List list):
        System.out.println("Original list: " + numbers); // Outputs: Original list: [2, 4, 7, 1, 3]
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers); // Outputs: Shuffled list: [3, 4, 1, 7, 2]
    }
}
