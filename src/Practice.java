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

    // Count how many words are longer than n characters and shorter than m
    // characters in: HashSet
    public static int countWordsByLength(HashSet<String> words, int n, int m) {
        // varible to hold the count
        int count = 0;

        // go through each word in the set
        for (String word : words) {
            // check if the word is longer then n and shorter than m
            if (word.length() > n && word.length() < m) {
                count++;
            }

        }
        // return the count
        return count;
    }

    // Find the difference between the how many odd and even numbers there are in:
    // HashMap

    public static int oddEvenDifference(HashMap<String, Integer> numbers) {
        // our variables
        int oddCount = 0;
        int evenCount = 0;

        // go through each number in the map
        for (int number : numbers.values()) {
            // check if it is even or odd
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // return the difference
        return Math.abs(oddCount - evenCount);
    }

    // Find the second-largest number in:
    // The keys of a HashMap

    public static int secondLargestKey(HashMap<Integer, String> map) {
        // varibles to track largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // go through all of the keys in the map
        for (int key : map.keySet()) {
            // check if it is larger then the curreent largest
            if (key > largest) {
                // we want to update both
                secondLargest = largest;
                largest = key;
                // check if it is larger than second largest but not equal to largest
            } else if (key > secondLargest && key != largest) {
                // update second largest
                secondLargest = key;
            }
        }

        // return the second largest found
        return secondLargest;

    }

}
