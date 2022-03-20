package JavaProgram.HomeWork;

public class Exercise3DisplayEPAM {
    public static void main(String[] args) {
        System.out.println();

        for (int row = 0; row <= 4; row++) {
            for (int col = 0; col < 30; col++) {
                if (row == 0) {
                    if (col < 4 || (col > 5 && col < 10) || col == 16 || col == 23 || col == 27) {
                        System.out.print('*');
                    } else System.out.print(' ');
                }
                if (row == 1) {
                    if (col == 0 || col == 6 || col == 9 || col == 15 || col == 17 || col == 23 || col == 24 || col == 26 || col == 27) {
                        System.out.print('*');
                    } else System.out.print(' ');
                }
                if (row == 2) {
                    if (col < 2 || (col > 5 && col < 10) || col == 14 || col == 18 || col == 23 || col == 25 || col == 27) {
                        System.out.print('*');
                    } else System.out.print(' ');
                }
                if (row == 3) {
                    if (col == 0 || col == 6 || (col > 12 && col < 20) || col == 23 || col == 27) {
                        System.out.print('*');
                    } else System.out.print(' ');
                }
                if (row == 4) {
                    if (col < 4 || col == 6 || col == 12 || col == 20 || col == 23 || col == 27) {
                        System.out.print('*');
                    } else System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

}