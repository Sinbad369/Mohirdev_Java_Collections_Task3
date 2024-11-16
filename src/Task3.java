import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("3. Task 3");
        System.out.println("a) Clone the HashSet");
        HashSet<Float> floatNumbers = new HashSet<>();
        floatNumbers.add(22f);
        floatNumbers.add(32f);
        floatNumbers.add(56f);
        HashSet<Float> cloned = (HashSet<Float>) floatNumbers.clone();
        System.out.println("b) Convert the cloned set into ArrayList");
        ArrayList<Float> converted = new ArrayList<>(cloned);
        System.out.println("c) Print the elements located in an even indices on the ArrayList");
        for (int i = 1; i < converted.size(); i++) {
            if (i % 2 == 0){
                System.out.println(converted.get(i));
            }
        }
    }
}
