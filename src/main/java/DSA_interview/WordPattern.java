package DSA_interview;

//Word Pattern
//You have been given two strings 'S' and ‘T’. Your task is to find if ‘S’ follows 
//the same pattern as ‘T’.Here follow means a full match, i.e. there is a 
//bijection between a letter of ‘T’ and a non-empty word of ‘S’.

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    // This method checks if the given pattern matches the given string
    public static boolean wordPattern(String pattern, String s) {
        // Create two maps to store the mappings between characters and words
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();

        // Split the input string into words
        String[] words = s.split(" ");

        // Check if the number of words matches the length of the pattern
        if (words.length != pattern.length()) {
            return false;
        }

        // Iterate over the pattern and words simultaneously
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i); // Get the current character from the pattern
            String word = words[i]; // Get the corresponding word from the input string

            // Check if the character is already mapped to a word
            if (patternMap.containsKey(c)) {
                // If the mapped word doesn't match the current word, return false
                if (!patternMap.get(c).equals(word)) {								
                    return false;
                }
            } else {
                // Check if the word is already mapped to a character
                if (wordMap.containsKey(word)) {
                    return false;
                }
                // Add the mapping to both maps
                patternMap.put(c, word);
                wordMap.put(word, c);
            }
        }

        // If the entire pattern matches without conflicts, return true
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        // Call the wordPattern method to check if the pattern matches the string
        boolean isMatch = wordPattern(pattern, s);
        System.out.println(isMatch);
    }
}