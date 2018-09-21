package com.example.gunjansrivastava.arraysandstring.sorting;

import java.lang.reflect.Array;

/* Java program for Merge Sort */
class MergeSort{

    public static void main(String[] args){
        int[] array = new int[]{3, 8, 2, 1, 5, 4, 6, 7};
        MergeSort sort = new MergeSort();
        sort.mergeSort(array);

        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }

    private void merge(int[] array , int[] left , int[] right){
        int l=0;
        int r=0;
        int k=0;
        int lLength = left.length;
        int rLength = right.length;

        while(l < lLength && r < rLength){
            if(left[l] < right[r] ){
                array[k] = left[l];
                l++;
            }else{
                array[k] = right[r];
                r++;
            }
            k++;
        }
        while(l< lLength){
            array[k] = left[l];
            k++;
            l++;
        }
        while(r < rLength){
            array[k] = right[r];
            k++;
            r++;
        }
    }

    private void mergeSort(int[] array){
        int length = array.length;
        if(length < 2){
            return;
        }
        int mid = length/2;
        int[] left = new int[mid];
        int[] right = new int[length-mid];
        for(int i = 0 ; i < mid ; i++){
            left[i] = array[i];
        }
        for(int j = mid ; j < length ; j++){
            right[j-mid] = array[j];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array,left,right);
    }
}