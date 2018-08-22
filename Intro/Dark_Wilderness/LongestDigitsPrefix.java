package codeFighters;

/*** 
---Pergunta/ Question---
Given a string, output its longest prefix which contains only digits.

Dada uma string, imprima seu prefixo mais longo, que contém apenas dígitos.
---Comentários/ Comments---
Make an algorithm that finds the largest number prefix in a String

Faça um algoritmo que encontre o maior prefixo de números em uma String
***/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestDigitsPrefix {
	public static void main(String[] args) {
		System.out.println(longestDigitsPrefix("aab 5 5 "));
	}
	
	static String longestDigitsPrefix(String inputString) {
		String myRegex = "^\\d+";
		Pattern pattern = Pattern.compile(myRegex);
		Matcher matcher = pattern.matcher(inputString);
		if(matcher.find()){
			return matcher.group(0);
		}
		return "";
	}
}
