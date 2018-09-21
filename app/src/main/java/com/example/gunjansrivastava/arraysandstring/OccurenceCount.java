package com.example.gunjansrivastava.arraysandstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OccurenceCount {

    HashMap<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) {
        OccurenceCount instance = new OccurenceCount();
        List<String> inputList = new ArrayList<>();
        inputList.add("abc");
        inputList.add("bc");
        inputList.add("b");
        inputList.add("c");
        inputList.add("ac");
        instance.getCountOccurrence(inputList);
    }

    private int getCountOccurrence(List<String> inputList) {
        int count = 0;
        int pos = 0;
        for (String s : inputList) {
            while (pos < s.length()) {
                char c = s.charAt(pos);
                int wordLen = pos + 1;
                if (inputList.contains(Character.toString(c))) {
                    count++;
                }
                while (wordLen < s.length()) {
                    String resultString = Character.toString(s.charAt(pos)) + Character.toString(s.charAt(wordLen));
                    if (inputList.contains(resultString)) {
                        count++;
                    }
                    wordLen++;
                }
                pos++;
            }
            resultMap.put(s, count);
            count = 0;
            pos = 0;
        }

        System.out.println(resultMap);
        return count;
    }
}
