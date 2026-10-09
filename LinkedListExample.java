import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Step 2: Initialize linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] initialValues = {0, 1, 7, 1, 2, 3, 4, 5, 6, 7};

        // Adding initial values to the linked list
        for (int value : initialValues) {
            linkedList.add(value);
        }

        // Step 6: Display original list
        System.out.println("Original LinkedList: " + linkedList);

        // Step 7: Add new element "9" at index 1
        linkedList.add(1, 9);

        // Step 8: Display updated linked list
        System.out.println("Updated LinkedList: " + linkedList);
    }
}