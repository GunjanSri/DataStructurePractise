package com.example.gunjansrivastava.arraysandstring;

import java.util.Arrays;

public class SumOfThreeNumbers {

    public static void main(String[] args){
        SumOfThreeNumbers instance = new SumOfThreeNumbers();
        int[] arrays = new int[]{1, 4, 45, 6, 10, 8};
        int reqSum = 20;
        instance.findSum(arrays , reqSum);
    }

    private void findSum(int[] arrays , int reqSum){
        Arrays.sort(arrays);
        int leftPosition = 1;
        int rightPosition = arrays.length -1;

        for(int i = 0 ; i < arrays.length - 2 ; i++){
            leftPosition = i+1;
            rightPosition = arrays.length -1;
            while(leftPosition < rightPosition){
                int sum = arrays[i] + arrays[leftPosition] + arrays[rightPosition];
                if(sum == reqSum){
                    System.out.print("(" + arrays[i] +" " + arrays[leftPosition] + " " + arrays[rightPosition] + ")");
                    leftPosition = leftPosition + 1;
                    rightPosition = rightPosition - 1;
                }
                if(sum > reqSum){
                    rightPosition = rightPosition - 1;
                }else if (sum < reqSum){
                    leftPosition = leftPosition + 1;
                }
            }

        }
    }
}
