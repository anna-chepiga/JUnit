package module_5.updated;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class ArrayUtilsTest {
    @Test
    public void testCreateRandomArray() throws Exception {
        int[] arrayZeros = new int[100];

        int[] arrayRandom = new int[100];
        arrayRandom = ArrayUtils.createRandomArray(arrayRandom);

        assertNotEquals(arrayRandom, arrayZeros);
    }

    @Test
    public void testGetMinMax() throws Exception {
        int[] array = new int[]{5, -20, 33, 8, 16, 400, -227};

        MinMaxPair actualPair = ArrayUtils.getMinMax(array);

        int max = actualPair.getMax();
        int min = actualPair.getMin();

        assertEquals(max, 400);
        assertEquals(min, -227);
    }

    @Test
    public void testSortArray() throws Exception {
        int[] array = new int[]{4, -13, 0, 88, 1002, 750, -128};
        int[] actual = ArrayUtils.sortArray(array);
        Arrays.sort(array);

        assertArrayEquals(array, actual);
    }
}