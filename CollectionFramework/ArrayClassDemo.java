package CollectionFramework;

import java.util.Arrays;

public class ArrayClassDemo {
    public static void main(String[] args) {

//        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12};
//
//        //To search an element
//        int index = Arrays.binarySearch(a, 5);
//        System.out.println("The index of element 5 in the array is  " + index);

        int a[] = {33, 2, 22, 43, 66, 34};

        //To sort the array
        Arrays.sort(a);

        for (int i: a){
            System.out.print(i + " ");
        }


    }
}
