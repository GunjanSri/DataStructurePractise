package com.example.gunjansrivastava.arraysandstring.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int[] unsortedArr = new int[]{3, 7, 4, 4, 6, 5, 8};
        int[] sortedArr = sort.sort(unsortedArr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    private int[] sort(int[] unsortedArr) {
        int numOfLoops = unsortedArr.length - 1;
        boolean sortHappened = false;
        while (numOfLoops > 0) {
            for (int i = 1; i < unsortedArr.length; i++) {
                if (unsortedArr[i - 1] > unsortedArr[i]) {
                    int temp = unsortedArr[i - 1];
                    unsortedArr[i - 1] = unsortedArr[i];
                    unsortedArr[i] = temp;
                    sortHappened = true;
                }
            }
            if (!sortHappened) {
                return unsortedArr;
            } else {
                numOfLoops--;
                sortHappened = false;
            }
        }
        return unsortedArr;
    }
}
