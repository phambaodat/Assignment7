
package ex4.search;
import java.util.ArrayList;
public class Ex4Search {
     public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");
        boolean containsPython = keywords.contains("Python");
        if (containsPython) {
            System.out.println("\"Python\" da co trong danh sach.");
        } else {
            System.out.println("\"Python\" khong co trong danh sach.");
        }
    }
}