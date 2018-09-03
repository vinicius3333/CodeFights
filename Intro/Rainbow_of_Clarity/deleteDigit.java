package CodeFights.Intro.Rainbow_of_Clarity;

/*** 
---Pergunta/ Question---
Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Dado um número inteiro, encontre o número máximo que você pode obter excluindo exatamente um dígito do número dado.
---Comentários/ Comments---
Make an algorithm to return as many as possible by deleting a digit.

Faça um algoritmo para retornar o maior número possível deletando um dígito.
***/

public class deleteDigit {
    public static void main(String[] args) {
        System.out.println(deleteDigit(152));
    }

    static int deleteDigit(int n) {
        int maior = 0;
        int sum;
        int con;
        String str = String.valueOf(n);
        StringBuffer str2 = new StringBuffer(str);

        for(int i = 0; i < str.length(); i++){
            str2.deleteCharAt(i);
            con = Integer.parseInt(String.valueOf(str2));
            sum = con;
            if(sum > maior){
                maior = sum;
            }
            str2 = new StringBuffer(str);
        }
        return maior;
    }
}
