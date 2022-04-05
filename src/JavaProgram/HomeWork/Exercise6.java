package JavaProgram.HomeWork;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your string: ");
        String input = scanner.nextLine();
        String results = uniqueCharacter(input);
        System.out.println(results);
    }

    public static String uniqueCharacter(String input) {
        char[] results = new char[input.length()];
        int index = 0;
        for (char c : input.toCharArray()) {
            boolean isUnique = true;
            for (char result : results) {
                if (result == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                results[index] = c;
                index++;
            }
        }
        String filteredResults = "";

        int i = 0;
        while (i < index) {
            filteredResults += results[i];
            i++;
        }
        return filteredResults;
    }
}
