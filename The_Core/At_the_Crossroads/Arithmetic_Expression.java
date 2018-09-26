package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
Consider an arithmetic expression of the form a#b=c. Check whether it is possible to replace # with one of the four signs: +, -, * or / to 
obtain a correct expression.

Considere uma expressão aritmética da forma a # b = c. Verifique se é possível substituir # por um dos quatro sinais: +, -, * ou / para
obter uma expressão correta.
---Comentários/ Comments---
Make an algorithm that checks whether any of the four basic operations between a and b will be equal to c.

Faça um algoritmo que verifique se alguma das quatro operações básicas entre a e b irão ser igual(is) a c.
***/

public class Arithmetic_Expression {
    public static void main(String[] args) {
        System.out.println(arithmeticExpression(2, 3, 5));
    }

    static boolean arithmeticExpression(double a, int b, int c) {
        return a + b == c || a * b == c || a / b == c || a - b == c;
    }
}
