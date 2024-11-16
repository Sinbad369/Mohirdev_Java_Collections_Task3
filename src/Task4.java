import java.util.ArrayList;
import java.util.HashSet;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("4. Task 4:");
        System.out.println("a) Write a method that compares two HashSet collections and returns " +
                "their common elements as an ArrayList");
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        set1.add("apple");
        set1.add("bear");
        set1.add("coconut");
        set1.add("dogma");
        set2.add("lollipops");
        set2.add("beer");
        set2.add("dogma");
        set2.add("apple");
        System.out.println("Set1 elements:"  + set1);
        System.out.println("Set2 elements:"  + set2);
        System.out.println("Common elements of Set1 and Set2: " + commonElements(set1, set2));
        System.out.println("b) Write a method that compares two HashSet collections and returns the elements that are " +
                "not present in either of them as an ArrayList.");
        System.out.println("Set1 elements:"  + set1);
        System.out.println("Set2 elements:"  + set2);
        System.out.println("Unique and all elements in the sets: " + uniqueAndAllElements(set1, set2));

    }

    public static ArrayList<String> commonElements(HashSet<String> set1, HashSet<String> set2){
        HashSet<String> elementsInSet1 = new HashSet<>(set1);
        elementsInSet1.retainAll(set2);
        return new ArrayList<>(elementsInSet1);
    }
    public static ArrayList<String> uniqueAndAllElements(HashSet<String> set1, HashSet<String> set2){
        HashSet<String> elementsInSets = new HashSet<>(set1);
        elementsInSets.addAll(set2);
        elementsInSets.removeAll(commonElements(set1, set2));
        return new ArrayList<>(elementsInSets);
    }
}
