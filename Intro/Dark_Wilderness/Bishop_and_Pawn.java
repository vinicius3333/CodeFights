package CodeFights.Intro.Dark_Wilderness;


/*** 
---Pergunta/ Question---
Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the
pawn in one move. The bishop has no restrictions in distance for each move, but is limited to diagonal movement.

Dadas as posições de um bispo branco e um peão preto no tabuleiro de xadrez padrão, determine se o bispo pode capturar o
peão em um movimento. O bispo não tem restrições de distância para cada movimento, mas se limita ao movimento diagonal.
---Comentários/ Comments---
Make an algorithm to find out if in the position of the bishop in the game he can hit his target.

Faça um algoritmo para descobrir se na posição do bispo no jogo ele consegue acertar o seu alvo.
***/

public class Bishop_and_Pawn {
    public static void main(String[] args) {
        System.out.println(bishopAndPawn("e3","a7"));
    }

    static boolean bishopAndPawn(String bishop, String pawn) {
        return Math.abs((bishop.charAt(0)-97)-(pawn.charAt(0)-97)) == Math.abs((bishop.charAt(1)-48)-(pawn.charAt(1)-48));
    }
}
