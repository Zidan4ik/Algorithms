package algorithm_sortingAlgorithms.sort_new.comb;

public class Comb {
    private static int updatedGap(int gap) {
        gap = (gap * 10) / 13; //shrink gap

        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    static void combSort(int a[], int n) {
        int gap = n;
        int swapped = 1;

        while (gap != 1 || swapped == 1) {
            gap = updatedGap(gap); // find updated gap
            swapped = 0; // for checking on swapped between elements

            for (int i = 0; i < n - gap; i++) {
                if (a[i] > a[i + gap]) {
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = temp;
                    swapped = 1;
                }
            }
        }
    }
}