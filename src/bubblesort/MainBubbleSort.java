package bubblesort;

import static util.Utils.*;
import java.util.Arrays;

public class MainBubbleSort {
    // 22, 35, -15, 7, 55, 1, -22
    // unsortedPartitionIndex -> entire array is unsorted,
    // lastPosition, in this case, 6
    // O(n^2) time complexity, it will take 100 steps to sort 10 items

    public static void bubbleSort(int[] array){ // stable sort algorithm because equals values does not swap positions
        int unsortedPartitionIndex =  array.length - 1;
        while (unsortedPartitionIndex > 0 ){
            for (int i = 0; i < unsortedPartitionIndex; i++){
                if (i == unsortedPartitionIndex) break;
                swapValues(array, i);
            }
            unsortedPartitionIndex--;
        }
    }

    private static void swapValues(int[] array, int i) {
        if(array[i] > array[i +1]){
            int current = array[i];
            int next = array[i +1];
            array[i + 1] = current;
            array[i] = next;
        }
    }

    public static void main(String[] args) {
        int[] array = {22, 35, -15, 7, 55, 1, -22, -15};
        print(array, "Unsorted: ");
        bubbleSort(array);
        print(array, "Sorted: ");

    }



}
