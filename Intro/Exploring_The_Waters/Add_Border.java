package CodeFights.Intro.Exploring_The_Waters;

import java.util.Arrays;

public class Add_Border {
    public static void main(String[] args){
        System.out.println(addBorder(new String[]{"abcde",
                "fghij",
                "klmno",
                "pqrst",
                "uvwxy"}));
    }

    static String[] addBorder(String[] picture){
        String[] aux = new String[picture.length + 2];
        int q = 0;
        int c = aux.length;
        int t = 0;

        for(int i = 0; i < picture.length; i++){
            picture[i] += "*";
            picture[i] = "*" + picture[i];
        }

        for(int i = 0; i < aux.length; i++){
            aux[i] = "";
        }
        for(int i = 0; i < picture[0].length(); i++){
            aux[0] += "*";
            aux[aux.length-1] += "*";
        }

        while(0 < c){
            if(aux[q].isEmpty()){
                aux[q] = picture[t];
                t++;
            }
            q++;
            c--;
        }
        return aux;
    }
}
