package com.example.gunjansrivastava.arraysandstring;

public class StringPermutation {

    public static void main(String[] args){
        StringPermutation stringPermutation = new StringPermutation();
        boolean isPermuted = stringPermutation.isPermutated("GHAGG" , "GGGHA");

        System.out.println(isPermuted);
    }

    private boolean isPermutated(String firstString , String secondString){
        if(firstString.length() != secondString.length()){
            return false;
        }
        char[] charArray = new char[128];
        for(Character c : firstString.toCharArray()){
            charArray[c] ++;
        }

        for(Character c: secondString.toCharArray()){
            charArray[c]--;
            if(charArray[c] < 0){
                return false;
            }
        }

        for(Character c : charArray){
            if(c != 0 ){
                return false;
            }
        }
        return true;
    }
}
