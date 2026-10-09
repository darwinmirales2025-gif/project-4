import java.util.Arrays;

public class RevMethod {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        reverseArray(numbers);
        
        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
    
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}