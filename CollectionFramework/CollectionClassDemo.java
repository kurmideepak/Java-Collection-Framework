package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionClassDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(34);
        list.add(44);
        list.add(53);
        list.add(65);
        list.add(24);
        list.add(12);
        list.add(75);

        // To show the minimum element
        System.out.println("Min element is "+ Collections.min(list));

        // To show the max element
        System.out.println("Min element is "+ Collections.max(list));

        // To check the frequency of element
        System.out.println("Min element is "+ Collections.frequency(list, 44));

        // To sort element
        Collections.sort(list);
        System.out.println(list);

        // sort element in descendind order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
