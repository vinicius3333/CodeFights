package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
In tennis, a set is finished when one of the players wins 6 games and the other one wins less than 5, or, if both players win at
least 5 games, until one of the players wins 7 games. Determine if it is possible for a tennis set to be finished with the score 
score1 : score2.

No ténis, um conjunto termina quando um dos jogadores ganha 6 jogos e o outro ganha menos de 5, ou, se ambos os jogadores ganharem
em menos 5 jogos, até que um dos jogadores ganhe 7 jogos. Determine se é possível terminar um jogo de tênis com a pontuação
score1: score2.
---Comentários/ Comments---
Make an algorithm to check if it is possible for the game of tennis to end with scoreboard score1: score2.

Faça um algoritmo para verificar se é possível para o jogo de tennis acabar com o placar score1 : score2.
***/

public class Tennis_Set {
    public static void main(String[] args) {
        System.out.println(tennisSet(3, 6));
    }

    static boolean tennisSet(int score1, int score2) {
        return ((score1 < 5 && score2 == 6) || ((score1 >= 7 && score2 >= 5) && Math.abs(score1 - score2) <= 2) || (score2 < 5 && score1 == 6) || ((score1 >= 5 && score2 >= 7) && Math.abs(score1 - score2) <= 2)) && score1 != score2;
    }
}
