package module_5.updated;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // можно сказать, что здесь антишаблон копи-паст в sout'ах
        // по сути печатается один и тот же текст везде и меняется только печатаемый список
        // можно было бы вынести печать одинаковыъ кусков текста в отдельный метод
        // но мне кажется, в данном случае выделение sout'ов в отдельные методы ненужно усложнит задачу

        System.out.println("Please select: 1) create array randomly; 2) create array manually:");
        String choice = sc.next();

        switch (choice) {
            case "1":
                int[] randomArray = createArray(sc);

                randomArray = ArrayUtils.createRandomArray(randomArray);
                System.out.println("The created random array is: " + Arrays.toString(randomArray));

                randomArray = ArrayUtils.sortArray(randomArray);
                System.out.println("The same array sorted is: " + Arrays.toString(randomArray));

                MinMaxPair minMax = ArrayUtils.getMinMax(randomArray);
                System.out.println(minMax);
                break;
            case "2":
                int[] manualArray = createArray(sc);

                System.out.println("Please enter array elements:");
                for (int i = 0; i < manualArray.length; i++) {
                    manualArray[i] = sc.nextInt();
                }
                System.out.println("The created manual array is: " + Arrays.toString(manualArray));

                manualArray = ArrayUtils.sortArray(manualArray);
                System.out.println("The same array sorted is: " + Arrays.toString(manualArray));

                MinMaxPair minMax1 = ArrayUtils.getMinMax(manualArray);
                System.out.println(minMax1);
                break;
            default:
                System.out.println("Incorrect entry");
        }
    }

    public static int[] createArray(Scanner sc) {
        System.out.println("Please enter array length:");
        int size = sc.nextInt();
        return new int[size];
    }
}