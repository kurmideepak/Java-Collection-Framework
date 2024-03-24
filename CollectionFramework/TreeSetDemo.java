package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(13);
        set.add(44);
        set.add(14);
        set.add(15);
        set.add(9);
        set.add(31);
        System.out.println(set);

        set.remove(44);
        System.out.println(set);

        System.out.println(set.contains(13));  // Shows either the element is present in set or not
        System.out.println(set.contains(50));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);

    }
}
