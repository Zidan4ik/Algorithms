package task.task4;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        String s = "roma";
        System.out.println(s.charAt(1));
        checkEquation();
    }

    public static void checkEquation() { // 'x*(y-10)', '()'
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рівняння: ");
        String equation = scanner.nextLine();
        boolean isOpen = false;
        boolean isClosed = false;
        char[] brackets;
        int index = 0;
        int countOpen, countClose;
        countOpen=countClose=0;

        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(') {
                countOpen++;
            } else if (equation.charAt(i) == ')') {
                countClose++;
            }
        }

        brackets  = new char[countOpen+countClose];
        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(') {
                brackets[index++] = equation.charAt(i);
            } else if (equation.charAt(i) == ')') {
                brackets[index++] = equation.charAt(i);
            }
        }


        if(countOpen==countClose){
            for (int i = 0; i < brackets.length/2; i++) {
                if (brackets[i] == '(') {
                    isOpen=true;
                }else{
                    isOpen=false;
                    break;
                }
            }
            for (int i = brackets.length/2; i < brackets.length; i++) {
                if (brackets[i] == ')') {
                    isClosed=true;
                }else{
                    isClosed=false;
                    break;
                }
            }
        }else{
            System.out.println("не парна кількість дужок");
        }
        if (isOpen && isClosed){
            System.out.println("Дужки в рівнянні розставлені правильно.");
        }
        else{
            System.out.println("Дужки в рівнянні розставлені не правильно.");
        }
        scanner.close();
    }
}
