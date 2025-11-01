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

}
