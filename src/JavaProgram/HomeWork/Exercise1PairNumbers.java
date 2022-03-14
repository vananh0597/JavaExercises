package JavaProgram.HomeWork;

import java.util.Scanner;

public class Exercise1PairNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Your first number is ");
        int a = number.nextInt();
        System.out.print("Your second number is ");
        int b = number.nextInt();
        System.out.print("Your third number is ");
        int c = number.nextInt();

        if (a == b && b == c) {
            System.out.print("All number are equal! They are: " + "\n" + "a = " + a + "\n" + "b = " + b +  "\n" + "c = " + c);
        } else if (a == b && b !=c)
        {
            System.out.println("a = " + a + "\n" + "b = " + b);
        } else if (a != b && a == c) {
            System.out.println("a = " + a + "\n" + "c = " + c);
        } else if (b == c && a != c){
            System.out.println("b = " + b + "\n" + "c = " + c);
        } else {
            System.out.println("All three numbers are different");
        }
    }
}
