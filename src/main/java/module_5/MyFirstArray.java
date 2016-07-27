package module_5;

public class MyFirstArray {
    public static void main(String[] args) {
        int[] myArray = new int[15];

        for (int a = 0; a < myArray.length; a++) {
            myArray[a] = (int) (Math.random() * 100);
        }

        for (int element : myArray) {
            System.out.print(element + " ");
        }

        int max = myArray[0];
        int min = myArray[0];

        for (int aMyArray : myArray) {
            if (aMyArray > max) {
                max = aMyArray;
            }

            if (aMyArray < min) {
                min = aMyArray;
            }

        }

        System.out.println("\n max = " + max + "; min = " + min);
    }
}