package com.example.gunjansrivastava.arraysandstring.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        String s = "new string";
        System.out.println(s.toString());
        BubbleSort sort = new BubbleSort();
        int[] unsortedArr = new int[]{3, 7, 4, 4, 6, 5, 8};
        int[] sortedArr = sort.sort(unsortedArr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    private int[] sort(int[] unsortedArr) {
        int arrLength = unsortedArr.length;
        boolean swapHappened = false;
        while (arrLength - 1 > 0) {
            for (int i = 0; i < arrLength - 1; i++) {
                if (unsortedArr[i] > unsortedArr[i + 1]) {
                    int j = unsortedArr[i + 1];
                    unsortedArr[i + 1] = unsortedArr[i];
                    unsortedArr[i] = j;
                    swapHappened = true;
                }
            }
            if (!swapHappened) {
                break;
            } else {
                arrLength--;
                swapHappened = false;
            }

        }

        return unsortedArr;

    }
}
