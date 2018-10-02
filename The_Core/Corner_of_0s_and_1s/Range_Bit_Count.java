package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
You are given two numbers a and b where 0 ≤ a ≤ b. Imagine you construct an array of all the integers from a to b inclusive. You
need to count the number of 1s in the binary representations of all the numbers in the array.

Você recebe dois números aeb onde 0 ≤ a ≤ b. Imagine que você construa uma matriz de todos os inteiros de a para b inclusive. 
Você precisa contar o número de 1s nas representações binárias de todos os números da matriz.
---Comentários/ Comments---
Make an algorithm that counts all 1's of numbers "a" through "b".

Faça um algoritmo que conte todos os 1s dos números de "a" até "b".
***/

public class Range_Bit_Count {
    public static void main(String[] args) {
        System.out.println(rangeBitCount(2, 7));
    }

    static int rangeBitCount(int a, int b) {
        String[] arr = new String[b - a + 1];
        int j = 0, count = 0;

        for(int i = a; i <= b; i++){
            arr[j] = Integer.toBinaryString(i);
            j++;
        }

        for(String i : arr){
            for(int q = 0; q < i.length(); q++){
                if(i.charAt(q) == '1') count++;
            }
        }

        return count;
    }

}
