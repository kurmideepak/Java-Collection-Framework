package CollectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Elephant");
        animals.push("Tiger");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);


    }
}
