package JavaProgram.HomeWork;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] array1 = initialArray();
        int[] array2 = secondArray();
        int[] thirdArray = new int[5];
        int i;
        for (i = 0; i < 5; i++) {
            thirdArray[i] = array1[i] + array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(thirdArray));
    }

    public static int[] initialArray() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int randomNum = (int) (Math.random() * 9);
            arr[i] = randomNum;
        }
        return arr;
    }

    public static int[] secondArray() {
        int[] secondArr = new int[5];
        for (int i = 0; i < 5; i++) {
            int randomNum = (int) (Math.random() * 10);
            secondArr[i] = randomNum;
        }
        return secondArr;
    }
}

