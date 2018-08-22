package com.example.gunjansrivastava.arraysandstring;

public class StringCompression {
    StringBuilder outputString = new StringBuilder();

    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        StringBuilder compressedString = stringCompression.compressString("aaaabbbccccc");
        System.out.println(compressedString);
    }

    private StringBuilder compressString(String inputString) {
        int i = 0;
        int count = 0;

        while (i < inputString.length() - 1) {
            if (inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
                i++;
                if (i + 1 == inputString.length()) {
                    char c = inputString.toCharArray()[i];
                    outputString.append(c);
                    outputString.append(count);
                }
            } else {
                char c = inputString.toCharArray()[i];
                outputString.append(c);
                outputString.append(count);
                count = 1;
                i++;
            }
        }
        return outputString;
    }
}


