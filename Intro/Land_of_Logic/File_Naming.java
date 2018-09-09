package CodeFights.Intro.Land_of_Logic;

/*** 
---Pergunta/ Question---
You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one 
which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the
obtained name is not used yet. Return an array of names that will be given to the files.

Você recebe uma variedade de nomes de arquivos desejados na ordem de sua criação. Como dois arquivos não podem ter nomes 
iguais, o que vem depois terá um acréscimo ao seu nome em uma forma de (k), onde k é o menor inteiro positivo tal que o
nome obtido ainda não é usado. Retorna uma matriz de nomes que serão dados aos arquivos.
---Comentários/ Comments---
Make an algorithm that, if the array has one or more Strings equal, put "(k)" after the String, where k is the smallest positive 
integer, so that the name is not yet used.

Faça um algoritmo que, se a array tiver uma ou mais Strings iguais, coloque "(k)" depois da String, onde k é o menor inteiro
positivo, de forma que o nome obtido ainda não seja usado.
***/

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
