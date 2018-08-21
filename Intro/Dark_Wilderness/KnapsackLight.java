package codeFighters;

/*** 
---Pergunta/ Question---
You found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second item weighs weight2 
and is worth value2. What is the total maximum value of the items you can take with you, assuming that your max weight capacity 
is maxW and you can't come back for the items later? Note that there are only two items and you can't bring more than one item 
of each type, i.e. you can't take two first items or two second items.

Você encontrou dois itens em um baú de tesouro! O primeiro item pesa o peso1 e vale a pena valor1, e o segundo item pesa o peso2
e vale a pena value2. Qual é o valor máximo total dos itens que você pode levar com você, supondo que sua capacidade máxima de peso
é maxW e você não pode voltar para os itens mais tarde? Note que existem apenas dois itens e você não pode trazer mais de um item
de cada tipo, ou seja, você não pode levar dois primeiros itens ou dois segundos itens.
---Comentários/ Comments---
Make an algorithm you discover according to the weight of each treasure, and also your own limit, the amount you can carry.

Faça um algoritmo que descubra de acordo com o peso de cada tesouro, e também o seu próprio limite, o valor que você consegue
carregar.
***/

public class KnapsackLight {
	public static void main(String[] args) {
		System.out.println(knapsackLight(10,5,6,4,8));
	}
	static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
		 if(weight1+weight2<=maxW){
				return value1+value2;
		 } 
		 else if(value1 > value2){
			 if(weight1 <= maxW){
				 return value1;
				 } 
			 else{
				 return value2;
				 }
		 }
		 else{
			 if(weight2 <= maxW){
				 return value2;
				 }
			 else{
				return value1;
				}
		}
	}
}
