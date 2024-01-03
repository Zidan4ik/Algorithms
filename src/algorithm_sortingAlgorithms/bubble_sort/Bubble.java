package algorithm_sortingAlgorithms.bubble_sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] array = new int[]{5,2,1,8,0,-15,12,62,1};
        boolean flag = true;

        while(flag){
            flag=false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    int num = array[i];
                    array[i] = array[i+1];
                    array[i+1]=num;
                    flag=true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
