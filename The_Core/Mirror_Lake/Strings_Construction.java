package CodeFights.The_Core.Mirror_Lake;

import java.util.ArrayList;

public class Strings_Construction {
    public static void main(String[] args) {
        System.out.println(stringsConstruction("abc", "abccba"));
    }

    static int stringsConstruction(String a, String b) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < a.length(); i++){
            for(int j = 0; j < b.length(); j++){
                if(a.charAt(i) == b.charAt(j)){
                    count++;
                }
                System.out.println(a.charAt(i) + " " + b.charAt(j));
            }
            list.add(count);
            count = 0;
        }
        return 0;
    }
}
