package algorithm_sortingAlgorithms.sort_new.cocktail;


public class Cocktail {
    static void cocktailSort(int array[]) {
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while (swapped == true) {
            // reset the swapped flag on entering the loop, because it might be true from a previous iteration.
            swapped = false;

            // loop from start to end in array
            for (int i = start; i < end - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            // if nothing moved, then array is sorted.
            if (swapped == false) {
                break;
            }

            // otherwise, reset the swapped flag so that it can be used in the next stage
            swapped = false;

            // move the end point back by one, because item at the end is in its rightful spot
            end = end - 1;

            // from top to bottom, doing the same comparison as in the previous stage
            for (int i = end - 1; i >= start; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            // increase the starting point, because the last stage would have moved the next smallest number to its rightful spot.
            start = start + 1;
        }
    }
}
