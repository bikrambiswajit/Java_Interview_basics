package DSA_interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String[] strArr = {"java", "ajav", "aajv", "abcd", "bcda", "xyza"};

        // Processing each string in the array
        String[] result = Arrays.stream(strArr)
            .map(s -> s.chars()                    // Convert string to IntStream of characters
                .distinct()                        // Remove duplicates
                .mapToObj(c -> String.valueOf((char) c)) // Convert int back to character
                .collect(Collectors.joining()))    // Collect characters to form a string
            .toArray(String[]::new);               // Convert Stream to String array

        // Output the result
        Arrays.stream(result).forEach(System.out::println);
    }
}
