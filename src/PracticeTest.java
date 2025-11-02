import static org.junit.Assert.*;
import java.util.*;
// forgot needed to download the red hat

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = { 8, -2, 9, -5 };

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffAllNegative() {
        // Arrange
        int[] numbers = { -4, -5, -1, -3 };

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // largest: -1, smallest: -5, difference: -1 -5 = 4
        assertEquals(4, actual);
    }

    // TODO: Make tests for each problem you solve

    @Test
    void testlongestWordStartingCharacter() {
        // Arrange
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("BMW", "Audi", "Acura", "Chevrolet", "Alfa Romeo", "Ford"));

        // Act
        String actual = Practice.longestWordStartingCharacter(words, 'A');
        ;

        // Assert
        assertEquals("Alfa Romeo", actual);

    }

    @Test
    void testcountWordsByLength() {
        // Arrange
        HashSet<String> words = new HashSet<>(
                Arrays.asList("cat", "dog", "elephant", "tiger", "lion", "bear", "zebra"));

        // Act
        int actual = Practice.countWordsByLength(words, 2, 5);

        // Assert
        // words longer than 2 and shorter than 5 are cat, dog, bear and lion so 4
        // expected
        assertEquals(4, actual);
    }

    @Test
    void testoddEvenDifference() {
        // Arrange
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("a", 2);
        numbers.put("b", 5);
        numbers.put("c", 3);
        numbers.put("d", 8);
        numbers.put("e", 10);

        // Act
        int actual = Practice.oddEvenDifference(numbers);

        // Assert
        // there are 2 odd numbers and 3 even numbers so the difference should be 1
        assertEquals(1, actual);

    }

    @Test
    void testSecondLargestKey() {
        // Arrannge
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(3, "b");
        map.put(2, "c");
        map.put(5, "d");
        map.put(4, "e");

        // Act
        int actual = Practice.secondLargestKey(map);

        // Assert
        // the largest key is 5 and the second largest is 4
        assertEquals(4, actual);

    }
}
