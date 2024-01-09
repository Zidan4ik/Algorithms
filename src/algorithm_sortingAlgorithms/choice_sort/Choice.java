package algorithm_sortingAlgorithms.choice_sort;

import java.util.Arrays;

public class Choice {
    public static int[] sortChoice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < arr[i]) {
                    int num = arr[i];
                    arr[i] = arr[k];
                    arr[k] = num;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{2,-1,4,0,-5,1,10};
        System.out.println("************************************");
        System.out.println("Array, before sort: "+ Arrays.toString(arr));
        sortChoice(arr);
        System.out.println("Array, after sort: "+ Arrays.toString(arr));
        System.out.println("************************************");
    }
}