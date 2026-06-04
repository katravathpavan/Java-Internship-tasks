import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // Create a queue using LinkedList
        LinkedList<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.add("Prabhas");
        queue.add("Pavan");
        queue.add("Pawankalyan");

        System.out.println("Queue: " + queue);

        // Dequeue element
        String removed = queue.removeFirst();
        System.out.println("Dequeued Element: " + removed);

        System.out.println("Queue after Dequeue: " + queue);
    }
}