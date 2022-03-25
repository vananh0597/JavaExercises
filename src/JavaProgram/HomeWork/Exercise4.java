package JavaProgram.HomeWork;

public class Exercise4 {
    public static void main(String[] args) {
        // picture 1
        int i;
        for (i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = 4; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

        // picture 2
        for (i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // picture 3
        for (i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // picture 4
        for (i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
