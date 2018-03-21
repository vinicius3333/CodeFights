package CodeFights.Intro.Land_of_Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class File_Naming {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fileNaming(new String[]{"dd",
                "dd(1)",
                "dd(2)",
                "dd",
                "dd(1)",
                "dd(1)(2)",
                "dd(1)(1)",
                "dd",
                "dd(1)"})));
    }

    static String[] fileNaming(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        int j;
        String temp;
        for(int i = 0; i < names.length; i++){
            j = 1;
            temp = names[i];
            while(list.contains(names[i])){
                names[i] = temp;
                names[i] = names[i] + "("+ j +")";
                j++;
            }
            list.add(names[i]);
        }

        String[] str = new String[list.size()];

        for(int i = 0; i < list.size(); i++){
            str[i] = list.get(i);
        }

        return str;
    }

}
