package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
Imagine a white rectangular grid of n rows and m columns divided into two parts by a diagonal line running from the upper left to 
the lower right corner. Now let's paint the grid in two colors according to the following rules:
A cell is painted black if it has at least one point in common with the diagonal;
Otherwise, a cell is painted white.
Count the number of cells painted black.

Imagine uma grade retangular branca de n linhas e m colunas divididas em duas partes por uma linha diagonal que vai do canto
superior esquerdo até o canto inferior direito. Agora vamos pintar a grade em duas cores de acordo com as seguintes regras:
Uma célula é pintada de preto se tiver pelo menos um ponto em comum com a diagonal;
Caso contrário, uma célula é pintada de branco.
Conte o número de células pintadas de preto.
---Comentários/ Comments---
Make an algorithm to count how many squares the line slopes.

Faça um algoritmo para contar quantos quadrados a linha encosta.
***/

public class Count_Black_Cells {
    public static void main(String[] args) {
        System.out.println(countBlackCells(2,3));
    }

    static int countBlackCells(int n, int m) {
        return n + m + gcd(n, m) - 2;
    }

    static int gcd(int a, int b)
    {
        if(a == 0 || b == 0) return a+b;
        return gcd(b,a%b);
    }
}
