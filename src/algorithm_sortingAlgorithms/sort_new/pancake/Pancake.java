package algorithm_sortingAlgorithms.sort_new.pancake;


class Pancake {

    private static void flip(int arr[], int i){
        int temp, start = 0;
        while (start < i) {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }

    private static int findMax(int arr[], int n) {
        int mi, i;
        for (mi = 0, i = 0; i < n; ++i)
            if (arr[i] > arr[mi])
                mi = i;
        return mi;
    }

    static int pancakeSort(int arr[], int n) {
        // start from the complete array and one by one reduce current size by one
        for (int curr_size = n; curr_size > 1; --curr_size) {
            // find index of the maximum element in array
            int mi = findMax(arr, curr_size);

            // move the maximum element to end in array
            if (mi != curr_size-1) {
                // to move at the end, first move maximum number to beginning
                flip(arr, mi);

                // Now move the maximum number to end by reversing current array
                flip(arr, curr_size-1);
            }
        }
        return 0;
    }
}
