package CodeFights.The_Core.Mirror_Lake;

import java.util.ArrayList;

public class Strings_Construction {
    public static void main(String[] args) {
        System.out.println(stringsConstruction("abc", "abccba"));
    }

    static int stringsConstruction(String a, String b) {
        int result = 0;

        while(true){
            for(int i = 0; i < a.length(); i++){
                int index = b.indexOf(a.charAt(i));
                if(index == -1){
                    return result;
                } else{
                    b = b.substring(0,index) + "." + b.substring(index+1);
                }
            }
            result++;
        }
    }
}
