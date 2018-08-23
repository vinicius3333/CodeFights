package codeFighters;

/*** 
---Pergunta/ Question---
Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its
digits until we get to a one digit number. Given an integer, find its digit degree.

Vamos definir o grau de dígito de um número inteiro positivo como o número de vezes que precisamos substituir esse número pela 
soma de seus dígitos até chegarmos a um número de um dígito. Dado um inteiro, encontre seu grau de dígito.
---Comentários/ Comments---
Make an algorithm that counts how many times we need to add the digits of the number until it is in a single digit.

Faça um algoritmo que conte quantas vezes precisamos somar os digítos do número até ele ficar com um só digíto.
***/

public class DigitDegree {
	public static void main(String[] args) {
		System.out.println(digitDegree(91));
	}
	
	static int digitDegree(int n) {
		String str = String.valueOf(n);
		int sum = 0, leftPart, rightPart, c = 0;
		while(str.length()!=1){
			sum = 0;
			for(int i = 0; i < str.length(); i++){
				sum += str.toCharArray()[i]-48;
			}
			str = String.valueOf(sum);
			c++;
		}
		return c;
	}
}
