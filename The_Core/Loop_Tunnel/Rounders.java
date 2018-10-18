package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
We want to turn the given integer into a number that has only one non-zero digit using a tail rounding approach. This means that
at each step we take the last non 0 digit of the number and round it to 0 or to 10. If it's less than 5 we round it to 0 if it's
larger than or equal to 5 we round it to 10 (rounding to 10 means increasing the next significant digit by 1). The process stops
immediately once there is only one non-zero digit left.

Queremos transformar o inteiro dado em um número que tenha apenas um dígito diferente de zero usando uma abordagem de
arredondamento de cauda. Isto significa que a cada passo tomamos o último dígito não 0 do número e arredondamos para 0 ou 10. 
Se for menor que 5, arredondamos para 0 se for maior ou igual a 5, arredondamos para 10 (arredondamento para 10 significa 
aumentar o próximo dígito significativo em 1). O processo é interrompido imediatamente quando houver apenas um dígito diferente
de zero.
---Comentários/ Comments---
Make an algorithm that returns the rounded number.

Faça um algoritmo que retorna o número arredondado.
***/

public class rounders {
    public static void main(String[] args) {
        System.out.println(rounders(15));
    }

    static int rounders(int value) {
        StringBuilder str = new StringBuilder(String.valueOf(value));
        int newValue = value, c, ant;

        for(int i = 1; i < str.length(); i++){
            c = (int)str.charAt(str.length()-i)-48;
            if(c >= 5){
                ant = 10 - c;
                ant *= (int)Math.pow(10,i-1);
                newValue = Integer.parseInt(String.valueOf(str)) + ant;
                str = new StringBuilder(String.valueOf(newValue));
            } else{
                str.setCharAt(str.length()-i, '0');
                newValue = Integer.parseInt(String.valueOf(str));
            }
        }

        return newValue;
    }

}
