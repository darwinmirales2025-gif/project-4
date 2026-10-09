import java.util.Scanner;
import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        System.out.print("Enter the position (0 to " + array.length + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position > array.length) {
            System.out.println("Invalid position!");
        } else {
            int[] newArray = new int[array.length + 1];

            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position) {
                    newArray[i] = element;
                } else {
                    newArray[i] = array[j++];
                }
            }

            System.out.println("Updated Array: " + Arrays.toString(newArray));
        }
        scanner.close();
    }
}