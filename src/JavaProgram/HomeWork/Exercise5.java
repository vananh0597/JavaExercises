package JavaProgram.HomeWork;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int desireArrLength = scanner.nextInt(); //input number of elements
        int[] myArrInt = new int[desireArrLength];
        for (int index = 0; index < desireArrLength; index++) {
            System.out.print("Index " + index + " : "); // input each elements
            myArrInt[index] = scanner.nextInt();
        }
        System.out.println("Elements of the array are: "); // display elements of the array
        for (int value : myArrInt) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Elements of the array in reversed order are: "); // display elements of the array in reversed order
        for (int i = myArrInt.length - 1; i >= 0; i--) {
            System.out.print(myArrInt[i] + " ");
        }
    }
}

