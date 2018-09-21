package CodeFights.The_Core.At_the_Crossroads;

/*** 
---Pergunta/ Question---
You are playing an RPG game. Currently your experience points (XP) total is equal to experience. To reach the next level your XP should
be at least at threshold. If you kill the monster in front of you, you will gain more experience points in the amount of the reward.
Given values experience, threshold and reward, check if you reach the next level after killing the monster.

Você está jogando um jogo de RPG. Atualmente, seu total de pontos de experiência (XP) é igual a experiência. Para alcançar o próximo 
nível, seu XP deve estar pelo menos no limiar. Se você matar o monstro à sua frente, você ganhará mais pontos de experiência no valor
da recompensa. Dados valores, experiência, limite e recompensa, verifique se você alcança o próximo nível depois de matar o monstro.
---Comentários/ Comments---
Make an algorithm that returns if it is possible to pass the number of the threshold variable with the variable experience and reward
together.

Faça um algoritmo que retorne se é possível passar o número da váriavel threshold com a variável experience e reward juntas.
***/

public class Reach_Next_Level {
    public static void main(String[] args){
        System.out.println(reachNextLevel(10, 15, 5));
    }

    static boolean reachNextLevel(int experience, int threshold, int reward) {
        return experience + reward >= threshold;
    }

}
