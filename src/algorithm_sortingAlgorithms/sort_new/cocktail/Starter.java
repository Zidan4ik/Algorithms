package algorithm_sortingAlgorithms.sort_new.cocktail;

import java.util.Arrays;

import static algorithm_sortingAlgorithms.sort_new.cocktail.Cocktail.cocktailSort;

public class Starter {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8, 0, 2};
        System.out.println("Working method's cocktail sorting for array");
        System.out.println("Before sorting: \n"+ Arrays.toString(array));
        cocktailSort(array);
        System.out.println("After sorting: \n"+ Arrays.toString(array));
    }
}
