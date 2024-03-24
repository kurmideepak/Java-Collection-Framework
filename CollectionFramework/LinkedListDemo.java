package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //LinkedList<Integer> list = new LinkedList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//
//        list.add(1,50);
//        System.out.println(list);
//
//        ArrayList<Integer> newlist = new ArrayList<>();
//        newlist.add(39);
//        newlist.add(40);
//        newlist.add(41);
//        System.out.println(newlist);
//        list.addAll(newlist);
//        System.out.println(list);
//
//        newlist.addAll(list);
//        System.out.println(newlist);
//
//        System.out.println(list.get(1));
//
//        list.remove(1);  // this will remove element at the index
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(3)); // This will remove the element form the arraylist
//        System.out.println(list);

//        list.clear(); //This will clear the list
//        System.out.println(list);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(6);
        list.add(70);
        list.add(80);
        System.out.println(list);

//        list.set(2,100);  //this will update the value at the index
//        System.out.println(list);
//
//        System.out.println(list.contains(50));

        for (int i=0; i<list.size(); i++){
            System.out.println("The element is at position "+(i+1)+": "+ list.get(i));
        }

        for (Integer element: list){
            System.out.println("The element is at position : "+ element);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator "+ it.next());
        }

    }
}
