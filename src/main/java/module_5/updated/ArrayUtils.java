package module_5.updated;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public static int[] createRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static MinMaxPair getMinMax(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int item : array) {
            if (item > max) max = item;
            if (item < min) min = item;
        }
        return new MinMaxPair(min, max);
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
        }
        return sortedArray;
    }
}