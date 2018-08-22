package com.example.gunjansrivastava.arraysandstring;

public class StringRotation {
    public static void main(String[] args){

        StringRotation stringRotation = new StringRotation();
        boolean result = stringRotation.isStringRotation("bottlewater" , "erbottlwat");
        System.out.print(result);
    }

    public boolean isStringRotation(String S1 , String S2){
        int len = S1.length();
        if(len == S2.length() && len > 0 ){
            String S1S1 = S1 + S1;
            //substring method is called
            if(S1S1.contains(S2)){
                return true;
            }
        }
        return false;
    }
}
