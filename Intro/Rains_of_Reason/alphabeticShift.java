package CodeFights.Intro.Rains_of_Reason;

/*** 
---Pergunta/ Question---
Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).

Dada uma string, substitua cada caractere pela seguinte no alfabeto inglês (z será substituído por a).
---Comentários/ Comments---
Make an algorithm that changes the letters of the word to a house next to it according to the alphabet

Faça um algoritmo que mude as letras da palavra para uma casa ao lado de acordo com o alfabeto
***/

public class alphabeticShift {
    public static void main(String[] args){
        System.out.print(alphabeticShift("teste"));
    }

    static String alphabeticShift(String inputString){
        char[] ch = inputString.toCharArray();
        int t = 0;

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'z'){
                ch[i] = 'a';
            } else{
                t = (int) ch[i];
                t++;
                ch[i] = (char) t;
            }
        }
        inputString = new String(ch);
        return inputString;
    }
}
