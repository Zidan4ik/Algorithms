package task.task4;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        checkEquation();
    }

    public static void checkEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рівняння: ");
        String equation = scanner.nextLine();

        int bracketCounter = 0;

        for (int i = 0; i < equation.length(); i++) {
            char currentChar = equation.charAt(i);

            if (currentChar == '(') {
                bracketCounter++;
            } else if (currentChar == ')') {
                bracketCounter--;
            }

            if (bracketCounter < 0) {
                break;
            }
        }

        if (bracketCounter == 0) {
            System.out.println("Дужки в рівнянні розставлені правильно.");
        } else {
            System.out.println("Дужки в рівнянні розставлені не правильно.");
        }

        scanner.close();
    }
}
