import java.util.Scanner;

public class LowMethod {
    
    // Method to find the lowest number in an array
    public static int findLowest(int[] numbers) {
        int lowest = numbers[0]; // Assume first element is the lowest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i]; // Update lowest if a smaller value is found
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Taking user input for the array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calling the method and displaying the lowest number
        int lowest = findLowest(numbers);
        System.out.println("The lowest number is: " + lowest);

        scanner.close();
    }
}