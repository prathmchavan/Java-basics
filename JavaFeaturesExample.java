import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JavaFeaturesExample {
    public static void main(String[] args) {

        
            /*Important note
             * To avoid famous exception called nullpoint exception we have optional class in java we can avoid it
             * In java there is method reference when we call function in function and that function is taking reference of method 
             * eg. .map(String::toUpperCase) so in this map is one function and another function is toUpperCase and the String is the refrence for it
             * In java there is constructor reference 
             */


             
        // Example of using Optional to avoid NullPointerException
        String[] words = new String[10];
        Optional<String> optionalWord = Optional.ofNullable(words[5]);

        // If value is present, convert to uppercase, otherwise return "default"
        String result = optionalWord.map(String::toUpperCase).orElse("default");
        System.out.println("Optional result: " + result);

        // Example of method reference
        List<String> wordList = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseWords = wordList.stream()
                .map(String::toUpperCase) // Method reference to toUpperCase
                .collect(Collectors.toList());

        System.out.println("Uppercase words: " + upperCaseWords);

        // Example of constructor reference
        List<Integer> lengths = wordList.stream()
                .map(String::length) // Method reference to length
                .collect(Collectors.toList());

        // Using constructor reference to create instances of WordLength
        List<WordLength> wordLengthObjects = lengths.stream()
                .map(WordLength::new) // Constructor reference
                .collect(Collectors.toList());

        System.out.println("WordLength objects: " + wordLengthObjects);

        // Another example of constructor reference with custom supplier
        Supplier<WordLength> wordLengthSupplier = WordLength::new;
        WordLength newWordLength = wordLengthSupplier.get();
        newWordLength.setLength(10);
        System.out.println("New WordLength object with length 10: " + newWordLength);
    }
}

class WordLength {
    private int length;

    // Default constructor
    public WordLength() {}

    // Constructor with length parameter
    public WordLength(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return "WordLength{" +
                "length=" + length +
                '}';
    }
}
