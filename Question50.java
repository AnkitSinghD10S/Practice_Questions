import java.util.Arrays;
import java.util.Scanner;

public class Question50 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read input
            String guestName = scanner.nextLine().trim();
            String hostName = scanner.nextLine().trim();
            String pileLetters = scanner.nextLine().trim();

            // Call the function and print the result
            String result = restoreNames(guestName, hostName, pileLetters);
            System.out.println(result);
        }
    }

    private static String restoreNames(String guestName, String hostName, String pileLetters) {
        // Concatenate the guest's name and the host's name
        String combinedNames = guestName + hostName;

        // Convert strings to char arrays for sorting
        char[] combinedArray = combinedNames.toCharArray();
        char[] pileArray = pileLetters.toCharArray();

        // Sort the arrays
        Arrays.sort(combinedArray);
        Arrays.sort(pileArray);

        // Check if the sorted characters of the concatenated names match the sorted characters of the pile letters
        if (Arrays.equals(combinedArray, pileArray)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}