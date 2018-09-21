package com.example.gunjansrivastava.arraysandstring.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] unsortedArr = new int[]{3, 8, 2, 1, 5, 4, 6, 7};
        int[] sortedArr = sort.sort(unsortedArr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    private int[] sort(int[] unsortedArr) {
        for (int i = 0; i < unsortedArr.length - 1; i++) {
            int smallestNo = unsortedArr[i];
            int pos = 0;
            for (int j = i + 1; j < unsortedArr.length; j++) {
                if (smallestNo > unsortedArr[j]) {
                    smallestNo = unsortedArr[j];
                    pos = j;
                }
            }
            int temp = unsortedArr[i];
            unsortedArr[i] = unsortedArr[pos];
            unsortedArr[pos] = temp;
        }

        return unsortedArr;
    }
}
