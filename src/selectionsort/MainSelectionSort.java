package selectionsort;
import java.util.HashMap;

import static util.Utils.*;

public class MainSelectionSort {

    public static void main(String[] args) {
        int[] array = {22, 35, -15, 7, 55, 1, -22, -15};
        print(array, "Unsorted: ");
        selectionSort(array);
        print(array, "Sorted: ");

    }

    // O(n^2), unstable, better than bubblesort usually
    private static void selectionSort(int[] array) {
        int lastUnsortedIndex = array.length - 1;
        for (int j = 0; j <  array.length - 1; j++){
            int largest = 0;
            for (int i = 1; i < lastUnsortedIndex; i++){
                if (array[i] > array[largest])  largest = i;
            }
            int copy = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[largest];
            array[largest] = copy;
            lastUnsortedIndex--;

        }
    }
}
