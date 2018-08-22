package com.example.gunjansrivastava.arraysandstring;

public class ReplaceSpaceWithCharacter {

    public static void main(String[] args) {
        ReplaceSpaceWithCharacter object = new ReplaceSpaceWithCharacter();
        object.replaceSpaceWithCharacter("Gun Jan    ", 8);
    }

    private String replaceSpaceWithCharacter(String inputString, int totalLength) {
        int spaceCount = 0;
        char[] inputStrArray = inputString.toCharArray();
        if (totalLength < inputString.length()) {
            for (int i = 0; i < totalLength; i++) {
                if (inputStrArray[i] == ' ') {
                    spaceCount++;
                }
            }
        }
        int finalLength = totalLength + spaceCount * 2;
        char[] resultArray = new char[finalLength];

        for (int i = totalLength - 1; i >= 0; i--) {
            if (inputStrArray[i] == ' ') {
                resultArray[finalLength - 1] = '0';
                resultArray[finalLength - 2] = '2';
                resultArray[finalLength - 3] = '%';
                finalLength = finalLength - 3;
            } else {
                resultArray[finalLength - 1] = inputStrArray[i];
                finalLength = finalLength - 1;
            }
        }

        String output = new String(resultArray);
        System.out.print(output);
        return inputString;
    }
}
