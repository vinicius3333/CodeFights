package CodeFights.Intro.Insland_of_Knowledge;

/*** 
---Pergunta/ Question---
Call two arms equally strong if the heaviest weights they each are able to lift are equal.
Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left),
and so are their weakest arms. Given your and your friend's arms' lifting capabilities find out if you two are equally strong.

Chame dois braços igualmente fortes se os pesos mais pesados ​​que cada um deles conseguir levantar forem iguais.
Chame duas pessoas igualmente fortes se seus braços mais fortes forem igualmente fortes 
(o braço mais forte pode ser tanto o direito quanto o esquerdo), assim como os braços mais fracos. Dada a capacidade
de levantamento de seus braços e do seu amigo, descubra se vocês dois são igualmente fortes.
---Comentários/ Comments---
Make an algorithm that checks whether the two pairs of numbers are equivalent

Faça um algoritmo que verifique se os dois pares de números são equivalentes
***/

public class areEquallyStrong {
    public static void main(String[] args){
        System.out.println(areEquallyStrong(15,10,15,9));
    }

    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight){
        return((yourLeft + yourRight) == (friendsLeft + friendsRight) && Math.abs(yourLeft-yourRight) == Math.abs(friendsLeft-friendsRight));
        /***
         *Verifica se a soma dos braços são iguais e se a diferença de cada indivíduo é igual;
         */
    }
}
