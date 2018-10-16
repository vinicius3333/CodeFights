package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
You have k apple boxes full of apples. Each square box of size m contains m × m apples. You just noticed two interesting 
properties about the boxes:
The smallest box is size 1, the next one is size 2,..., all the way up to size k.
Boxes that have an odd size contain only yellow apples. Boxes that have an even size contain only red apples.
Your task is to calculate the difference between the number of red apples and the number of yellow apples.

Você tem caixas de maçã k cheias de maçãs. Cada caixa quadrada de tamanho m contém maçãs m × m. Você acabou de notar duas
propriedades interessantes sobre as caixas:
A menor caixa é o tamanho 1, a próxima é o tamanho 2, ... até o tamanho k.
As caixas que têm um tamanho ímpar contêm apenas maçãs amarelas. Caixas que têm um tamanho par contêm apenas maçãs vermelhas.
Sua tarefa é calcular a diferença entre o número de maçãs vermelhas e o número de maçãs amarelas.
---Comentários/ Comments---
Make an algorithm to return the difference of yellow apples and red apples.

Faça um algoritmo para retornar a diferença de maçãs amarelas e maçãs vermelhas.
***/

public class Apple_Boxes {
    public static void main(String[] args) {
        System.out.println(appleBoxes(5));
    }

    static int appleBoxes(int k) {
        int y = 0, r = 0, ant;

        for(int i = 1; i <= k; i++){
            if(i%2!=0 && y > 0){
                ant = i;
                y += (ant*ant);
            } else if(y == 0) y = 1;
            if(i%2==0){
                ant = i;
                r += (ant*ant);
            }
        }

        return r - y;
    }
}
