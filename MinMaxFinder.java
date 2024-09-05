import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
       
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 integers as command line arguments.");
            return;
        }

        int[] numbers = new int[5];

        
        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure all arguments are integers.");
            return;
        }

        
        Arrays.sort(numbers);

        
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum value: " + numbers[0]);
        System.out.println("Maximum value: " + numbers[4]);
    }
}
