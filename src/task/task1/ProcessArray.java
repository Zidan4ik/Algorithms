package task.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessArray {
    private int[] arrayInteger;
    private int step;

    public void console() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int length = scanner.nextInt();
        this.arrayInteger = new int[length];

        for (int i = 0; i < this.arrayInteger.length; i++) {
            this.arrayInteger[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(this.arrayInteger));
        System.out.println("Введіть значення цілого числа для знаходження індексу: ");
        int value = scanner.nextInt();
        boolean isFound = false;

        for (int i = 0; i < this.arrayInteger.length; i++) {
            if (this.arrayInteger[i] == value) {
                System.out.println("значення: " + value + " під індексом: " + i);
                isFound = true;
                this.step++;
                break;
            }
            this.step++;
        }

        if (!isFound){System.out.println("значення: " + value + " немає в масиві");}
        System.out.println("Кількість шагів: "+this.step);
        scanner.close();
    }
}
