import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Given array
        int[] arr = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};
        int size = arr.length;
        
        // Display original array
        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nEnter the index of the element to delete (0 to " + (size - 1) + "): ");
        int index = scanner.nextInt();
        
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
        } else {
            // Store deleted element
            int deletedElement = arr[index];
            
            // Shift elements to the left
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            
            size--; // Reduce array size (not effective in fixed-size arrays)
            
            // Display new array
            System.out.println("Deleted Element: " + deletedElement);
            System.out.print("Updated Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
        scanner.close();
    }
}