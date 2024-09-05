import java.util.Arrays;

public class StringSorter1 {
    public static void main(String[] args) {
        // Check if exactly 5 arguments are provided
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 strings as command line arguments.");
            return;
        }

        // Create a String array and populate it with command line arguments
        String[] strings = new String[5];
        for (int i = 0; i < 5; i++) {
            strings[i] = args[i];
        }

        // Sort the array of strings
        Arrays.sort(strings);

        // Display the sorted strings
        System.out.println("Sorted strings: " + Arrays.toString(strings));
    }
}
