import java.util.ArrayList;

public class ArrayListDemo {

    // Add element
    public static void addElement(ArrayList<String> list, String element) {
        list.add(element);
        System.out.println(element + " added.");
    }

    // Remove element
    public static void removeElement(ArrayList<String> list, String element) {
        if (list.remove(element)) {
            System.out.println(element + " removed.");
        } else {
            System.out.println(element + " not found.");
        }
    }

    // Search element
    public static void searchElement(ArrayList<String> list, String element) {
        if (list.contains(element)) {
            System.out.println(element + " found in the list.");
        } else {
            System.out.println(element + " not found in the list.");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        addElement(list, "Apple");
        addElement(list, "Banana");
        addElement(list, "Mango");

        System.out.println("List: " + list);

        searchElement(list, "Banana");

        removeElement(list, "Apple");

        System.out.println("Updated List: " + list);
    }
}