
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsEx {

    public static void main(String[] args) {
        // Array list from collection class
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(10);
        num.add(10);
        num.add(10);
        num.add(10);
        // The following methods do not exist in ArrayList, they are for LinkedList
        // num.addLast(20);
        // num.addFirst(90);
        for (int n : num) {
            System.out.println(n);
        }
        // The following method does not exist in ArrayList, it is for LinkedList
        // System.out.println("this is " + num.getLast());

        // Set
        HashSet<Integer> no = new HashSet<Integer>();

        no.add(10);
        no.add(140);
        no.add(30);
        no.add(20);

        System.out.println(no.remove(20));
        // no.removeAll(no);
        // for(int i : no)
        // {
        // System.out.println(i);
        // }

        // Iterator method
        Iterator<Integer> val = no.iterator();
        // hasnext is bool return true until the reach to list end
        while (val.hasNext()) {
            // next returns the value from list
            System.out.println(val.next());
        }

        // Map
        // map is the collection of key and value pair it creates basically table
        // which will have the key for each value
        HashMap<String, Integer> m = new HashMap<String, Integer>();

        m.put("A", 20);
        m.put("B", 10);
        m.put("E", 40);
        m.put("F", 220);

        /*
         * Important notes
         * key cannot be repeated but values can, we can't have duplication in key
         * keys are set and values are list so map is combination of set and list
         */
        System.out.println("print only values: " + m.values());
        System.out.println("print only key: " + m.keySet());
        System.out.println("printing whole map: " + m);

        // Example of Comparable
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting (Comparable):");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people);

        System.out.println("After sorting by age (Comparable):");
        for (Person person : people) {
            System.out.println(person);
        }

        // Example of Comparator
        Collections.sort(people, new PersonNameComparator());

        System.out.println("After sorting by name (Comparator):");
        for (Person person : people) {
            System.out.println(person);
        }

        //stream api 
        /*Important notes 
         * we can't use stream onced used one we will get error if we use same stream 
         * steam provide the multiple operation for the list like maping , reducing etc
         */
        /**
         * Streams: - A stream is a sequence of elements that can be processed
         * in parallel or sequentially. - Streams do not store data; they
         * operate on the source data structure (such as a list or array). -
         * Streams support various operations like filter, map, and reduce,
         * which are typically performed in a pipeline. - Once a stream is
         * consumed (used), it cannot be reused. - Intermediate operations (such
         * as filter and map) are lazy; they are not executed until a terminal
         * operation (such as forEach or collect) is called.
         *
         * Parallel Streams: - Parallel streams enable parallel processing of
         * the stream's elements, which can improve performance for large
         * datasets. - Parallel streams split the data into multiple parts and
         * process them concurrently using multiple threads. - The order of
         * processing and the result may differ from the sequential stream, as
         * elements are processed in parallel.
         */
        List<Integer> al = Arrays.asList(1, 3, 5, 5);

        // Using forEach to print elements from the list
        al.forEach(n -> System.out.println("from stream API: " + n));

        // Creating a stream from the list
        Stream<Integer> s = al.stream();
        // Applying filter operation to get elements equal to 3
        Stream<Integer> s1 = s.filter(n -> n == 3);

        // Once a stream is used, it cannot be reused
        // Uncommenting the below line will cause an IllegalStateException
        // s.forEach(n -> System.out.println("from stream API: " + n));
        // Printing the elements in s1 stream
        s1.forEach(n -> System.out.println("filtered stream: " + n));

        // Example of using filter and map operations on a stream
        Stream<Integer> result = al.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * 2); // Multiply each element by 2

        // Printing the result stream
        result.forEach(n -> System.out.println("result stream: " + n));

        // Example of parallel stream
        // Parallel stream divides the content into multiple parts and processes them in parallel
        List<Integer> parallelList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> parallelStream = parallelList.parallelStream();
        parallelStream.forEach(n -> System.out.println("from parallel stream: " + n));

        // Note: The output order of parallel stream may not be consistent because it processes elements in parallel



    }
}

class Person implements Comparable<Person> {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other) {
        // Natural ordering by age
        /* This method defines the natural ordering of Person objects by age.
         * The compareTo method is used to compare the current object with
         * another object of the same type. Returns a negative integer, zero, or
         * a positive integer if this object is less than, equal to, or greater
         * than the specified object, respectively.
         */
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return this.name + ": " + this.age;
    }
}

class PersonNameComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        // Custom ordering by name // custom logic for sorting we use comparator
        /*
         * This method defines a custom ordering of Person objects by name. The
         * compare method is used to compare two objects of the same type.
         * Returns a negative integer, zero, or a positive integer if the first
         * argument is less than, equal to, or greater than the second argument,
         * respectively.
         */
        return p1.name.compareTo(p2.name);
    }
}
