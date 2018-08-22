package com.example.gunjansrivastava.arraysandstring;

import java.util.HashMap;

public class SumTwo {

    public static void main(String[] args){
        SumTwo sumTwo = new SumTwo();
        int[] input = {2,7,11,15};
        int[] result = sumTwo.twoSum(input , 9);
        for(int o : result)
            System.out.println(o);
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap();
        for(int i = 0 ; i < nums.length ; i++){
            int diff = target - nums[i];
            if(hashMap.containsKey(diff)){
                return new int[]{hashMap.get(diff) , i};
            }else{
                hashMap.put(nums[i] , i);
            }
        }

        return null;
    }
}
