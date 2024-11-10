
package ex6.sort;
import java.util.ArrayList;
import java.util.Collections;
public class Ex6Sort {
     public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}
