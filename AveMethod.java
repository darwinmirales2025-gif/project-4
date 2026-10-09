public class AveMethod {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        double avg = calculateAverage(numbers);
        System.out.println("The average is: " + avg);
    }
    
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}