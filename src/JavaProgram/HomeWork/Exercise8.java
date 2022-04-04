package JavaProgram.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int desireArrLength = scanner.nextInt();
        int[] myArrInt = new int[desireArrLength];
        for (int index = 0; index < desireArrLength; index++) {
            System.out.print("Index " + index + " : "); //index x:n
            //Reading the input from user
            myArrInt[index] = scanner.nextInt();
        }
        Arrays.sort(myArrInt);
        System.out.println("New array: " + Arrays.toString(myArrInt));
    }
}
