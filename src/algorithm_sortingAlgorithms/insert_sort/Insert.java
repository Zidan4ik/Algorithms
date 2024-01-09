package algorithm_sortingAlgorithms.insert_sort;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int [] arr = new int[]{5,2,1,8,0,-15,12,62,1};

        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int index = i;
            while (index > 0 && arr[index - 1] > currentValue) { //loop for sorted elements
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = currentValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
