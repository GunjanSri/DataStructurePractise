package com.example.gunjansrivastava.arraysandstring.sorting;

public class QuickSort {

    public static void main(String[] args){
        int[] array = new int[]{7,2,1,6,8,5,3,4};
        QuickSort sort = new QuickSort();
        sort.quickSort(array , 0 , array.length-1);

        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }

    private void quickSort(int[] array , int start , int end){
        if(start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    private int partition(int[] array , int start , int end){
        int pivot = array[end];
        int pivotIndex = start;
        for(int i = start ; i < end ; i++){
            if(array[i] <= pivot ){
                int temp = array[i];
                array[i] = array[pivotIndex];
                array[pivotIndex] = temp;
                pivotIndex ++;
            }

        }
        int temp = array[pivotIndex];
        array[pivotIndex] = array[end];
        array[end] = temp;

        return pivotIndex;
    }
}
