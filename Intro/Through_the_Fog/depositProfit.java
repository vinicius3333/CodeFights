package CodeFights.Intro.Through_the_Fog;

/*** 
---Pergunta/ Question---
You have deposited a specific amount of money into your bank account. Each year your balance increases at the same growth rate.
With the assumption that you don't make any additional deposits, find out how long it would take for your balance to pass a 
specific threshold. Of course you don't want to wait too long, so you know that the answer is not greater than 6.

Você depositou uma quantia específica em sua conta bancária. A cada ano, seu saldo aumenta na mesma taxa de crescimento.
Com a suposição de que você não faz nenhum depósito adicional, descubra quanto tempo levaria para que seu saldo passasse
limiar específico. Claro que você não quer esperar muito, então você sabe que a resposta não é maior que 6.
---Comentários/ Comments---
Make an algorithm that shows how many years your deposit will go over the limit

Faça um algoritmo que mostre quantos anos o seu depósito ira passar o limite
***/

public class depositProfit {
    public static void main(String[] args){
        System.out.print(depositProfit(100,20,170));
    }

    static int depositProfit(double deposit, double rate, double threshold){
        int c = 0;
        while(deposit < threshold){
            deposit += deposit * (rate/100);
            c++;
        }
        return c;
    }
}
