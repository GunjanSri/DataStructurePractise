package com.example.gunjansrivastava.arraysandstring;

public class PermutationPalindrome {

    public static void main(String[] args){
        PermutationPalindrome permutationPalindrome = new PermutationPalindrome();
        boolean isPermutation = permutationPalindrome.isPalindromePermutationPossible("aac aaccc");
        System.out.println(isPermutation);
    }

    private boolean isPalindromePermutationPossible(String inputString){
        char[] inputArr = inputString.toCharArray();
        int[] charArr = new int[(Character.getNumericValue('z') - Character.getNumericValue('a')) + 1];

        for (char c : inputArr) {
            if (Character.getNumericValue(c) != -1) {
                int a = Character.getNumericValue('a');
                int cvalue = Character.getNumericValue(c);
                int intValue = cvalue - a;
                charArr[intValue]++;
            }
        }
        boolean oddCount = false;
        for (int i : charArr) {
            if (i % 2 == 1) {
                if (oddCount)
                    return false;
                else oddCount = true;
            }
        }
        return true;
    }

    // Converted input string to palindrome
    /*private void getResult(String inputString){
        char[] inputArray = inputString.toCharArray();
        int inputArrayLength = inputString.length();

        for(int i = 0 ; i < inputArray.length ; i++){
            for(int j = i+1 ; j < inputArray.length ; j++ ){
                if(inputArray[i] == inputArray[j]){
                    char swap = inputArray[inputArrayLength-1];
                    inputArray[inputArrayLength-1] = inputArray[j];
                    inputArray[j] = swap;
                    inputArrayLength--;
                    break;
                }
            }
        }

        System.out.println(new String(inputArray));
    }*/
}
