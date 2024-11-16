import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Set tasks implementation below:");
        System.out.println("1. Task number 1:");
        System.out.println("a) Create a HashSet and add elements");
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        System.out.println(s);
        System.out.println("b) Print the elements of set via iterator");
        Iterator<String> stringIterator = s.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        System.out.println("c) Print the elements in a reversed order");
        List<String> sConvertedIntoList = new ArrayList<>(s);
        Collections.reverse(sConvertedIntoList);
        System.out.println(sConvertedIntoList);
    }
}