package com.example.gunjansrivastava.arraysandstring;

public class OneAway {

    public static void main(String[] args){
        OneAway oneAway = new OneAway();
        boolean isOneAway = oneAway.isOneAwayString("pale" , "ala");
        System.out.println(isOneAway);
    }

    private boolean isOneAwayString(String string1 , String string2){
        boolean charReplaced = false;
        boolean charInserted = false;
        boolean charDeleted = false;
        if(string2.length() == string1.length()+1){
            charInserted = isCharInserted(string1,string2);
        }
        if(string2.length() == string1.length()){
            charReplaced = isCharReplaced(string1 , string2);
        }
        if(string2.length() == string1.length()-1){
            charDeleted = isCharInserted(string1,string2);
        }
        return charDeleted ;
    }

    //paale palle
    private boolean isCharInserted(String string1, String string2) {
        int index1 = 0;
        int index2 = 0;
        while(index1 < string1.length() && index2 < string2.length()){
            if(string1.charAt(index1) != string2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }else{
                index1 ++;
                index2 ++;
            }
        }
        return true;
    }

    private boolean isCharReplaced(String string1 , String string2){
        boolean charReplaced = false;
        int replaceCount = 0;
        for(int i = 0 ; i < string1.length() ; i++){
            if(string1.charAt(i) != string2.charAt(i)){
                if(charReplaced){
                    return false;
                }else charReplaced = true;
            }else replaceCount ++;
        }
        if(replaceCount == string1.length())// no char has been replaced
            return false;
        else return true;
    }
}
