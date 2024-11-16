import java.util.ArrayList;
import java.util.HashSet;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("5. Task 5: ");
        System.out.println("a) Write a method that returns the elements present in the first HashSet but " +
                "not in the second as an ArrayList.\n" +
                "Example: For [1, 2, 3] & [3, 4, 5], the result should be [1, 2].");
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        set1.add("AT&T");
        set1.add("Standard Chartered");
        set1.add("Bank of America");
        set1.add("BlackRock");
        set2.add("AT&T");
        set2.add("Standard and Poor");
        set2.add("Bank of Uganda");
        set2.add("BlackHill");
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Elements only existant in first set: "
        + existsOnlyInFirstSet(set1, set2));

        System.out.println("b) Write a method that returns the elements present in the second HashSet but not " +
                "in the first as an ArrayList.\n" +
                "Example: For [1, 2, 3] & [3, 4, 5], the result should be [4, 5].");
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Elements only existant in second set: "
                + existsOnlyInSecondSet(set1, set2));

        System.out.println("c) Write a method that creates and returns an ArrayList containing only the " +
                "even elements from both HashSet collections.\n" +
                "Example: For [1, 2, 3] & [3, 4, 5], the result should be [2, 4].");
        HashSet<Integer> setIntegers1 = new HashSet<>();
        setIntegers1.add(1);
        setIntegers1.add(2);
        setIntegers1.add(56);
        setIntegers1.add(43);
        HashSet<Integer> setIntegers2 = new HashSet<>();
        setIntegers2.add(32);
        setIntegers2.add(65);
        setIntegers2.add(56);
        setIntegers2.add(480);
        System.out.println("Set1: " + setIntegers1);
        System.out.println("Set2: " + setIntegers2);
        System.out.println("Even numbers in both sets: " + onlyEvenNumbers(setIntegers1, setIntegers2));
    }

    public static ArrayList<String> existsOnlyInFirstSet(HashSet<String> set1, HashSet<String> set2){
        HashSet<String> existantInFirst = new HashSet<>(set1);
        existantInFirst.removeAll(set2);
        return new ArrayList<>(existantInFirst);
    }
    public static ArrayList<String> existsOnlyInSecondSet(HashSet<String> set1, HashSet<String> set2){
        HashSet<String> existantInSecond = new HashSet<>(set2);
        existantInSecond.removeAll(set1);
        return new ArrayList<>(existantInSecond);
    }
    public static ArrayList<Integer> onlyEvenNumbers(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> allNumbersInSets = new HashSet<>(set1);
        allNumbersInSets.addAll(set2);

        HashSet<Integer> evensInSets = new HashSet<>();
        for (Integer num : allNumbersInSets){
            if(num % 2 == 0){
                evensInSets.add(num);
            }
        }
        return new ArrayList<>(evensInSets);
    }

}
