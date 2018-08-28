package CodeFights.Intro.Eruption_of_Light;

/*** 
---Pergunta/ Question---
Elections are in progress!
Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters
who haven't cast their vote yet, find the number of candidates who still have a chance to win the election. The winner of the 
election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number
of votes, assume there is no winner at all.

Eleições estão em andamento!
Dado um conjunto dos números de votos dados a cada um dos candidatos até agora, e um inteiro k igual ao número de eleitores
que ainda não votaram, descubra o número de candidatos que ainda têm chance de vencer a eleição. O vencedor do eleição deve 
garantir estritamente mais votos do que qualquer outro candidato. Se dois ou mais candidatos receberem o mesmo número (máximo)
de votos, suponha que não há vencedor em tudo.
---Comentários/ Comments---
Make an algorithm that returns the number of candidates who can win an election.

Faça um algoritmo que retorne a quantidade de candidatos que podem ganhar uma eleição.
***/

public class Elections_Winner {
    public static void main(String[] args) {
        System.out.println(electionsWinners(new int[]{1,2,3},3));
    }

    static int electionsWinners(int[] votes, int k) {
        int count, count2 = 0;
        for(int i = 0; i < votes.length; i++){
            count = 0;
            for(int j = 0; j < votes.length; j++){
                if(votes[i]+k > votes[j] && i != j){
                    count++;
                } else if(i != j){
                    break;
                }
            }
            if(count == votes.length-1){
                count2++;
            }
        }
        return count2;
    }
}
