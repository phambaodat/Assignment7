
package ex3.traverse;
import java.util.ArrayList;
public class Ex3Traverse {
  public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("DaNang");
        cities.add("HCM");
        cities.add("HaNoi");
        cities.add("Hue");
        cities.add("QuyNhon");
        System.out.println("City names:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
