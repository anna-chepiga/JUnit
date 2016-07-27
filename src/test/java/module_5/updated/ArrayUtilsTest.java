package module_5.updated;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class ArrayUtilsTest {
    private static int[] array;

    @BeforeClass
    public static void setUp() throws Exception {
        array = new int[10];
    }

    @Test
    public void createRandomArray() throws Exception {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        assertArrayEquals(ArrayUtils.createRandomArray(array), array);
    }

    @Test
    public void getMinMax() throws Exception {

        String expected = ArrayUtils.getMinMax(array).toString();

        Arrays.sort(array);

        int min = array[0];
        int max = array[array.length - 1];

        MinMaxPair pair = new MinMaxPair(min, max);

        assertEquals(expected, pair.toString());
    }

    @Test
    public void sortArray() throws Exception {
        int[] actual = ArrayUtils.sortArray(array);
        Arrays.sort(array);

        assertArrayEquals(array, actual);
    }
}