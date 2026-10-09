import java.util.Scanner;

public class ArrayEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};

        // Display original array
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // User input for index and new value
        System.out.print("Enter index to edit (0-10): ");
        int index = scanner.nextInt();

        System.out.print("Enter new value: ");
        int newValue = scanner.nextInt();

        // Update array
        if (index >= 0 && index < array.length) {
            array[index] = newValue;
            System.out.println("Array after editing:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}