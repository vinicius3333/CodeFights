package CodeFights.Intro.Land_of_Logic;


/*** 
---Pergunta/ Question---
Given an integer product, find the smallest positive (i.e. greater than 0) integer the product of whose digits is equal to 
product. If there is no such integer, return -1 instead.

Dado um produto inteiro, encontre o menor inteiro positivo (ou seja, maior que 0) cujo produto dos dígitos é igual ao produto. 
Se não houver tal número inteiro, retorne -1.
---Comentários/ Comments---
Make an algorithm that finds a number that the product of its digits is equal to product variable.

Faça um algoritmo que encontre um número que o produto dos digitos dele sejam iguais a variavel produto.
***/

public class digitsProduct {
    public static void main(String[] args) {
        System.out.println(digitsProduct(12));
    }

    static int digitsProduct(int product) {

        for(int i = 0; i < 10000; i++){
            if(product(i) == product) return product(i);
        }

        return -1;
    }

    static int product(int n){

        int prod = 1;

        while(n > 1){
            prod *= n % 10;
            n = (int) Math.floor(n / 10);
        }

        return prod;
    }

}
