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
        Arrays.sort(this.arrayInteger);
        System.out.println(Arrays.toString(this.arrayInteger));
        System.out.println("Введіть значення цілого числа для знаходження індексу: ");

        int value = scanner.nextInt();
        int index = binarySearch(this.arrayInteger, value);

        if (index > 0) {
            System.out.println("індекс: "+index);
        } else {
            System.out.println("значення: " + value + " немає в масиві");
        }
        System.out.println("Кількість шагів: " + this.step);
        scanner.close();
    }

    public int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int midValue = left + (right - left) / 2;
            this.step++;
            if (array[midValue] < value) {
                left = midValue + 1;
            } else if (array[midValue] > value) {
                right = midValue - 1;
            } else if (array[midValue] == value) {
                return midValue;
            }
        }
        return -1;
    }
}
