# Java Collection Framework

Welcome to the Java Collection Framework repository! Here you'll find an extensive overview of the Java Collection Framework, a powerful set of classes and interfaces provided by Java to handle collections of objects.

## Introduction

Java Collection Framework provides a comprehensive set of classes and interfaces that facilitate the manipulation and management of groups of objects. Collections are used extensively in Java programming for various tasks such as storing, retrieving, and manipulating data efficiently.

## Features

- **Dynamic Data Structures**: The framework provides dynamic data structures like lists, sets, maps, and queues, allowing flexibility in storing and organizing data.
- **Generic Collections**: Collections in the framework are designed to work with any type of objects through generics, enhancing type safety and reusability of code.
- **High Performance**: The framework offers optimized data structures and algorithms for efficient operations such as searching, insertion, deletion, and traversal.
- **Interoperability**: Collections in the framework seamlessly integrate with other Java APIs and libraries, enabling easy data exchange and interoperability.
- **Extensibility**: The framework allows users to extend existing collection classes or implement custom collections by adhering to specified interfaces, facilitating customization as per specific requirements.

## Core Components

The Java Collection Framework consists of several core components:

- **Interfaces**: Define contracts for various types of collections such as List, Set, Map, Queue, etc.
- **Classes**: Implementations of the collection interfaces providing different data structures like ArrayList, LinkedList, HashSet, HashMap, PriorityQueue, etc.
- **Utility Classes**: Utility classes like Collections and Arrays provide methods for sorting, searching, and other operations on collections and arrays.

## Usage

To use the Java Collection Framework in your Java applications, simply import the necessary classes and interfaces from the `java.util` package. You can then create instances of collection classes and leverage their methods to manipulate data efficiently.

Example:

```java
package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList();
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

        ArrayList<Integer> list = new ArrayList<>();
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
