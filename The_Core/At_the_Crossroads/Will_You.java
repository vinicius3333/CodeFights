package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
Once Mary heard a famous song, and a line from it stuck in her head. That line was "Will you still love me when I'm no longer
young and beautiful?". Mary believes that a person is loved if and only if he/she is both young and beautiful, but this is quite 
a depressing thought, so she wants to put her belief to the test. Knowing whether a person is young, beautiful and loved, find out 
if they contradict Mary's belief. A person contradicts Mary's belief if one of the following statements is true:
    they are young and beautiful but not loved;
    they are loved but not young or not beautiful.

Certa vez, Mary ouviu uma canção famosa e uma linha dela ficou na cabeça dela. Essa linha era "Você ainda vai me amar quando eu
não estiver mais jovem e bonita? ". Maria acredita que uma pessoa é amada se e somente se ela é jovem e bonita, mas isso é 
um pensamento muito deprimente, então ela quer colocar sua crença em teste. Saber se uma pessoa é jovem, bonita e amada, descubra
se eles contradizem a crença de Maria. Uma pessoa contradiz a crença de Maria se uma das seguintes afirmações for verdadeira:
    eles são jovens e belos, mas não amados;
    eles são amados, mas não são jovens ou não são bonitos.
---Comentários/ Comments---
Make an algorithm to check if the case contradicts Mary's thinking.

Faça um algoritmo para verificar se o caso contradiz o pensamento de Mary.
***/

public class Will_You {
    public static void main(String[] args) {
        System.out.println(willYou(true, true, true));
    }

    static boolean willYou(boolean young, boolean beautiful, boolean loved) {
        return (young && beautiful && !loved) || (loved && (!young || !beautiful));
    }
}
