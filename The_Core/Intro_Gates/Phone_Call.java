package CodeFights.The_Core.Intro_Gates;

/*** 
---Pergunta/ Question---
Some phone usage rate may be described as follows:
first minute of a call costs min1 cents,
each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
each minute after 10th costs min11 cents.
You have s cents on your account before the call. What is the duration of the longest call
(in minutes rounded down to the nearest integer) you can have?

Algumas taxas de uso do telefone podem ser descritas da seguinte maneira:
primeiro minuto de uma chamada custa min1 centavos,
cada minuto do dia 2 até o dia 10 (inclusive) custa min2_10 centavos
cada minuto após o 10º custa min11 centavos.
Você tem s cents em sua conta antes da chamada. Qual é a duração da chamada mais longa
(em minutos, arredondado para o número inteiro mais próximo), você pode ter?
---Comentários/ Comments---
Make an algorithm to calculate the longest duration of a call.

Faça um algoritmo para calcular a maior duração de uma chamada. 
***/

public class Phone_Call {
    public static void main(String[] args) {
        System.out.println(phoneCall(3,1,2,20));
    }

    static int phoneCall(int min1, int min2_10, int min11, int s) {
        int t = 0, t2 = 0, t3 = 0;

        if(s >= min1){
            s -= min1;
            t++;
        }

        while(s > min2_10 && t2 < 9){
            s -= min2_10;
            t2++;
        }

        while(s >= min11 && t2 == 9){
            s -= min11;
            t3++;
        }

        System.out.printf("t1 = %d, t2 = %d, t3 = %d\n", t,t2,t3);

        return t + t2 + t3;
    }

}
