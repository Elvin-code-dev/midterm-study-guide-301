import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        // variables to hold the largest and smallest
        int largest = nums[0];
        int smallest = nums[0];

        // go through the array to find largest and smallest
        for (int num : nums) {
            // comapre to current largest and smallest
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        // we return the difference
        return largest - smallest;
    }

    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    // Find the longest word that starts with a specific character letter in: a
    // arrayList
    public static String longestWordStartingCharacter(ArrayList<String> words, char letter) {
        // variable to hold the longest word
        String longestWord = "";

        // go through each word in the arrayList
        for (String word : words) {
            // check if it starts with the letter that is needed
            if (word.charAt(0) == letter) {
                // check if it is longer than the current longest word
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

        }
        // return the longest word found
        return longestWord;
    }

}