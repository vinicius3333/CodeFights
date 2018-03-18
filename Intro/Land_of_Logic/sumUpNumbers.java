package CodeFights.Intro.Land_of_Logic;

import java.util.Arrays;

public class sumUpNumbers {
    public static void main(String[] args) {
        System.out.println(sumUpNumbers(" oranges, 3milk 66cartons ( litres)"));
    }

    static int sumUpNumbers(String inputString) {
        int sum = 0;
        boolean b = false;
        StringBuilder strB = new StringBuilder("");

        if(inputString.matches("\\s+")) return 0;

        if(inputString.matches(".*[a-zA-Z].*")) {
            String[] str = inputString.split("\\s+", 1);
            str = inputString.split("\\D+");
            for(String i : str){
                try{
                    sum += Integer.parseInt(i);
                } catch(java.lang.NumberFormatException e){
                }
            }
        } else{
            String[] str = inputString.split("\\D+");
            for(String i : str) {
                strB.append(i);
            }
            sum = Integer.parseInt(String.valueOf(strB));
        }
        return sum;
    }

}
