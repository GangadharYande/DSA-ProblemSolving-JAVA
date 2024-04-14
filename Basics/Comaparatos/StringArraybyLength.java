import java.util.Arrays;
import java.util.Comparator;

public class StringArraybyLength {

    public static void main(String[] args) {
        // Comparator initialization
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if (str1.length() < str2.length()) {
                    return -1; // Return -1 for ascending order
                } else {
                    return 1; // Return 1 for descending order
                }
            }
        };

        String[] str = {
            "Java",
            "Programming",
            "is",
            "fun",
            "and",
            "challenging",
            "Learn",
            "every",
            "day"
        }; // Declare and initialize an array of strings.

        // Sort the array
        Arrays.sort(str, comp);

        // Print the sorted array
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}