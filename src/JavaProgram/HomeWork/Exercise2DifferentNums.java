package JavaProgram.HomeWork;

import java.util.Scanner;

public class Exercise2DifferentNums {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your number here:");
        int inputNumber = number.nextInt();
        int originalNumber = inputNumber;
        int digit;
        int reversedNumber = 0;
        for (; inputNumber != 0; inputNumber /= 10) {
            digit = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("Input number is " + originalNumber);
        System.out.println("Reverse number is " + reversedNumber);
        System.out.println("Different number is " + (reversedNumber - originalNumber));
    }
}
