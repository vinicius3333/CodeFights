package CodeFights.Intro.Through_the_Fog;

import java.util.ArrayList;

public class stringRearrangement {
    public static void main(String[] args){
        System.out.println(stringsRearrangement(new String[]{"ab", "bb", "aa"}));
    }

    static boolean stringsRearrangement(String[] inputArray) {
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        for(int i = 0; i < inputArray.length; i++){
            ArrayList<Integer> row = new ArrayList<>();

            for(int j = 0; j < inputArray.length; j++){
                if(i != j && differByOne(inputArray[i], inputArray[j])){
                    row.add(j);
                }
            }

            edges.add(row);
        }

        final int length = inputArray.length;
        final int width = 1 << length;

        ArrayList<ArrayList<Boolean>> dp = new ArrayList<>();

        for(int i = 0; i < length; i++){
            ArrayList<Boolean> row = new ArrayList<>();

            for(int j = 0; j < width; j++){
                row.add(j == 1 << i);
            }

            dp.add(row);
        }

        for(int bin = 1; bin < width; bin++){
            StringBuffer indices = new StringBuffer(Integer.toBinaryString(bin)).reverse();

            for(int i = 0; i < indices.length(); i++){
                if(indices.toString().toCharArray()[i] == '1'){
                    for(int j = 0; j < indices.length(); j++){
                        if(i !=j
                                && indices.toString().toCharArray()[j] == '1'
                                && edges.get(j).indexOf(i) > -1
                                && dp.get(j).get(bin ^ 1 << i)){
                                    dp.get(i).set(bin,true);
                        }
                    }
                }
            }

        }

        for(ArrayList<Boolean> row : dp){
            if(row.get(width-1)) return true;
        }
        return false;
    }

    static boolean differByOne(String str1, String str2){
        int mismatches = 0;

        for(int i = 0; i < str1.length(); i++){
            if(str1.toCharArray()[i] != str2.toCharArray()[i]){
                mismatches++;
            }
        }
        return mismatches == 1;
    }

}
