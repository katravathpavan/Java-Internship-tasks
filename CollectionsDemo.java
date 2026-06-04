
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(81);
        numbers.add(78);
        numbers.add(50);
        numbers.add(55);
        numbers.add(250);

        System.out.println("Original List: " + numbers);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);

        // Find minimum and maximum elements
        System.out.println("Minimum Element: " + Collections.min(numbers));
        System.out.println("Maximum Element: " + Collections.max(numbers));
    }
}