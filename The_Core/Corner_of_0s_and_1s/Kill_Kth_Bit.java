package CodeFights.The_Core.Corner_of_0s_and_1s;

/*** 
---Pergunta/ Question---
In order to stop the Mad Coder evil genius you need to decipher the encrypted message he sent to his minions. The message contains
several numbers that, when typed into a supercomputer, will launch a missile into the sky blocking out the sun, and making all the 
people on Earth grumpy and sad. You figured out that some numbers have a modified single digit in their binary representation. 
More specifically, in the given number n the kth bit from the right was initially set to 0, but its current value might be
different. It's now up to you to write a function that will change the kth bit of n back to 0.

A fim de parar o gênio do mal Mad Coder você precisa decifrar a mensagem criptografada que ele enviou para seus asseclas. 
A mensagem contém vários números que, quando digitados em um supercomputador, lançam um míssil no céu bloqueando o sol e
deixando todas as pessoas na Terra amuadas e tristes. Você descobriu que alguns números têm um único dígito modificado em sua 
representação binária. Mais especificamente, no número dado n o k-bit da direita foi inicialmente definido como 0, mas seu valor
atual pode ser diferente. Agora cabe a você escrever uma função que irá alterar o k-bit de n de volta para 0.
---Comentários/ Comments---
Make an algorithm that takes the binary value of the number, its decimal place and change if it equals 1, if not just leave it 
anyway.

Faça um algoritmo que pegue o valor binário do número, a casa decimal dele e troque se for igual a 1, se não apenas deixe do mesmo 
jeito.
***/

public class Kill_Kth_Bit {
    public static void main(String[] args) {
        System.out.println(killKthBit(2738, 30));
    }

    static int killKthBit(int n, int k) {
        return n == 0 ? 0 : Integer.toBinaryString(n).length() < k ? n : new StringBuffer(Integer.toBinaryString(n)).reverse().charAt(k-1) == '1' ? (int) (n - Math.pow(2, k-1)) : n;
    }

}
