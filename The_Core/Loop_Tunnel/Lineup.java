package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
To prepare his students for an upcoming game, the sports coach decides to try some new training drills. To begin with, he lines
them up and starts with the following warm-up exercise: when the coach says 'L', he instructs the students to turn to the left.
Alternatively, when he says 'R', they should turn to the right. Finally, when the coach says 'A', the students should turn around.
Unfortunately some students (not all of them, but at least one) can't tell left from right, meaning they always turn right when 
they hear 'L' and left when they hear 'R'. The coach wants to know how many times the students end up facing the same direction.
Given the list of commands the coach has given, count the number of such commands after which the students will be facing the
same direction.

Para preparar seus alunos para um próximo jogo, o treinador de esportes decide experimentar alguns novos exercícios de 
treinamento. Para começar, ele as alinha e começa com o seguinte exercício de aquecimento: quando o treinador diz 'L', ele 
instrui os alunos a se voltarem para a esquerda. Alternativamente, quando ele diz 'R', eles devem virar para a direita. 
Finalmente, quando o treinador disser 'A', os alunos devem se virar. Infelizmente, alguns alunos (não todos, mas pelo menos um) 
não sabem distinguir à esquerda da direita, o que significa que eles sempre se voltam para a direita quando ouvem 'L' e saem 
quando ouvem 'R'. O treinador quer saber quantas vezes os alunos acabam voltados para a mesma direção. Dada a lista de comandos 
que o coach forneceu, conte o número desses comandos após o qual os alunos estarão voltados para a mesma direção.
---Comentários/ Comments---
Make an algorithm to calculate the sum of all the times that people are looking at the same place.

Faça um algoritmo para calcular a soma de todas as vezes que as pessoas estão olhando para o mesmo lugar.
***/

public class Lineup {
    public static void main(String[] args){
        System.out.println(lineUp("LLARL"));
    }

    static int lineUp(String commands) {
        int r = 0;
        boolean pair = true;

        for (int i = 0; i < commands.length(); i++) {
            char c = commands.charAt(i);
            if ((c == 'L' || c == 'R')) {
                if(!pair)
                    r++;
                pair = !pair;
            } else{
                if(pair)
                    r++;
            }
        }

        return r;
    }
}
