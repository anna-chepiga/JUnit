package module_5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int j;

        for (int a = 0; a < arr.length; a++) {
            arr[a] = (int) (Math.random() * 100);
            System.out.print(arr[a] + ", ");
        }

        System.out.println();
        System.out.println("сортируем массив");

        for (int i = arr.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}