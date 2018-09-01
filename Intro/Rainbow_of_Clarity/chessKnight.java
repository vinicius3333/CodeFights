package CodeFights.Intro.Rainbow_of_Clarity;

/*** 
---Pergunta/ Question---
Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.
The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one
square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all 
valid moves for a knight piece that is placed on one of the central squares.

Dada a posição de um cavaleiro no tabuleiro de xadrez padrão, encontre o número de movimentos diferentes que o cavaleiro pode
realizar. O cavalo pode mover-se para um quadrado de dois quadrados na horizontal e um quadrado na vertical, ou dois quadrados 
na vertical quadrado horizontalmente longe dele. O movimento completo, portanto, parece com a letra L. Confira a imagem abaixo 
para ver todos movimentos válidos para uma peça de cavaleiro colocada em uma das praças centrais.
---Comentários/ Comments---  
Make an algorithm to check how many houses the horse can reach.

Faça um algoritmo para verificar quantas casas o cavalo consegue alcançar.
***/

public class chessKnight {
    public static void main(String[] args) {
        System.out.println(chessKnight("a1"));
    }

    static int chessKnight(String cell) {
        int count = 0;
        int a = cell.charAt(0)-96;
        int b = cell.charAt(1)-48;

        if(a-2 > 0 && b-1 > 0 && a-2 <= 16 && b-1 <= 16){
            count++;
        }
        if(a-1 > 0 && b-2 > 0 && a-1 <= 16 && b-2 <= 16){
            count++;
        }
        if(a+1 > 0 && b-2 > 0 && a+1 <= 16 && b-2 <= 16){
            count++;
        }
        if(a+2 > 0 && b-1 > 0 && a+2 <= 16 && b-1 <= 16){
            count++;
        }
        if(a+1 > 0 && b+2 > 0 && a+1 <= 16 && b+2 <= 16){
            count++;
        }
        if(a+2 > 0 && b+1 > 0 && a+2 <= 16 && b+1 <= 16){
            count++;
        }
        if(a-1 > 0 && b+2 > 0 && a-1 <= 16 && b+2 <= 16){
            count++;
        }
        if(a-2 > 0 && b+1 > 0 && a-2 <= 16 && b+1 <= 16){
            count++;
        }

        return count;
    }

}
