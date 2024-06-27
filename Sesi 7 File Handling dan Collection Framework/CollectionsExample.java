import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Set
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplikat tidak akan ditambahkan

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 70);

        // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
                  System.out.println(iterator.next());
        }
    }
}