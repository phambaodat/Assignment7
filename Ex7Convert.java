
package ex7.convert;

import java.util.ArrayList;

public class Ex7Convert {

     public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Array elements:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
}