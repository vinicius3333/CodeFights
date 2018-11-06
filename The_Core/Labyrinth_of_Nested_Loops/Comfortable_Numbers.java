package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

/*** 
---Pergunta/ Question---
Let's say that number a feels comfortable with number b if a ≠ b and b lies in the segment [a - s(a), a + s(a)], where s(x) is 
the sum of x's digits. How many pairs (a, b) are there, such that a < b, both a and b lie on the segment [l, r], and each number 
feels comfortable with the other (so a feels comfortable with b and b feels comfortable with a)?

Digamos que o número a se sente confortável com o número b se a ≠ b e b estiverem no segmento [a - s (a), a + s (a)], onde s (x) 
é a soma dos dígitos de x.
Quantos pares (a, b) estão lá, de tal forma que a <b, ambos a e b estão no segmento [l, r], e cada número se sente confortável
com o outro (assim se sente confortável com be se sente confortável com um)?
---Comentários/ Comments---
Make an algorithm that returns the number of comfortable numbers.

Faça um algoritmo que retorne a quantidade de números confortáveis.
***/

public class Comfortable_Numbers {
    public static void main(String[] args) {
        System.out.println(comfortableNumbers(10, 12));
    }

    static int comfortableNumbers(int l, int r) {
        int pairs = 0;

        for(int i = l; i < r; i++){
            for(int j = i+1; j <= r; j++){
                if(isComfortable(i,j) && isComfortable(j,i)) pairs++;
            }
        }

        return pairs;
    }

    static boolean isComfortable(int a, int b){
        return a - addDigits(a) <= b && b <= a + addDigits(a);
    }

    static int addDigits(int num){
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num = (int)Math.floor(num/10);
        }
        return sum;
    }
}
