import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<String> names = new HashSet<>();

        // Add elements (including a duplicate)
        names.add("Prabhas");
        names.add("Pavan");
        names.add("Pawankalyan");
        names.add("Pavan"); // Duplicate

        // Display HashSet
        System.out.println("HashSet Elements: " + names);

        // Check if an element exists
        if (names.contains("Pavan")) {
            System.out.println("Pavan exists in the HashSet.");
        } else {
            System.out.println("Pavan does not exist in the HashSet.");
        }

        // Remove an element
        names.remove("Pawankalyan");

        // Display HashSet after removal
        System.out.println("After removing Pawankalyan: " + names);
    }
}