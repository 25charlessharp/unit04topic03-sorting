import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<String> original;
        ArrayList<String> expected;

        original = new ArrayList<String> (Arrays.asList("apple","coconut", "banana", "dog"));
        expected = new ArrayList<String> (Arrays.asList("apple","banana", "coconut", "dog"));
        StringListSort.selectionSort(original);
        assertEquals(expected, original);
    }

    @Test
    public void testInsertionSort() {
        ArrayList<String> original;
        ArrayList<String> expected;

        original = new ArrayList<String> (Arrays.asList("yogurt","dog", "banana", "zebra"));
        expected = new ArrayList<String> (Arrays.asList("banana","dog", "yogurt", "zebra"));
        StringListSort.insertionSort(original);
        assertEquals(expected, original);
    }
}
