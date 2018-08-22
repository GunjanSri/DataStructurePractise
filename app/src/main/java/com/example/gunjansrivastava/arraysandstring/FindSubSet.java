package com.example.gunjansrivastava.arraysandstring;

public class FindSubSet {
    public static void main(String[] args){
        int[] array = new int[]{1,2};
        FindSubSet obj = new FindSubSet();
        int[] subSetArray = new int[array.length];
        obj.getSubSet(array,subSetArray,0);
    }

    private void getSubSet( int[] array ,int[]subsetArray , int i){
        if(i == array.length){
            System.out.println(subsetArray.length);
        }else{
            subsetArray[i] = 0;
            getSubSet(array,subsetArray,i+1);
            subsetArray[i] = array[i];
            getSubSet(array,subsetArray,i+1);
        }
    }
}
