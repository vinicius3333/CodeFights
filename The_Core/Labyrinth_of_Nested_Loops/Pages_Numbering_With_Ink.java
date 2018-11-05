package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

/*** 
---Pergunta/ Question---
You work in a company that prints and publishes books. You are responsible for designing the page numbering mechanism in the 
printer. You know how many digits a printer can print with the leftover ink. Now you want to write a function to determine what
the last page of the book is that you can number given the current page and numberOfDigits left. A page is considered numbered if 
it has the full number printed on it (e.g. if we are working with page 102 but have ink only for two digits then this page will not
be considered numbered). It's guaranteed that you can number the current page, and that you can't number the last one in the book.

Você trabalha em uma empresa que imprime e publica livros. Você é responsável por projetar o mecanismo de numeração de páginas na
impressora. Você sabe quantos dígitos uma impressora pode imprimir com a tinta restante. Agora você quer escrever uma função para
determinar qual é a última página do livro que você pode numerar dada a página atual e numberOfDigits à esquerda. Uma página é 
considerada numerada se tiver o número completo impresso nela (por exemplo, se estivermos trabalhando com a página 102, mas 
tivermos tinta apenas para dois dígitos, essa página não será considerada numerada).
É garantido que você pode numerar a página atual e não pode numerar a última no livro.
---Comentários/ Comments---
Make an algorithm that takes a number and returns the last number with the required number of digits.

Faça um algoritmo que pegue um número e retorne o último número com a quantidade necessária de digítos. 
***/

public class Pages_Numbering_With_Ink {
    public static void main(String[] args) {
        System.out.println(pagesNumberingWithInk(1, 5));
    }

    static int pagesNumberingWithInk(int current, int numberOfDigits) {
        int dig = 0, a = 0;
        for(int i = current; i < 1200; i++){
            int aux = String.valueOf(i).length();
            dig += aux;
            a = i;
            System.out.println(a);
            if(dig + aux > numberOfDigits || dig >= numberOfDigits) break;
        }

        return a;
    }
}
