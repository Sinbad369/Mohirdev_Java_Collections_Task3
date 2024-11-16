import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("2. Task 2:");
        System.out.println("a) Print the size of HashSet");
        Set<Double> doubleNumbers = new HashSet<>();
        doubleNumbers.add(3.4);
        doubleNumbers.add(4.5);
        doubleNumbers.add(8.6);
        System.out.println(doubleNumbers.size());
        System.out.println("b) Print whether this set is empty or not");
        System.out.println(doubleNumbers.isEmpty());
        System.out.println("c) Delete all elements of the list");
        doubleNumbers.clear();
        System.out.println(doubleNumbers);
    }
}
