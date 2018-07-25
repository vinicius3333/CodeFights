package CodeFights.Intro.Smooth_Sailing;

/*** 
---Pergunta/ Question---
Some people are standing in a row in a park. There are trees between 
them which cannot be moved. Your task is to rearrange the people by 
their heights in a non-descending order without moving the trees. 
People can be very tall!

Algumas pessoas estão em fila em um parque. Há árvores entre elas
que não podem ser movidas. Sua tarefa é reorganizar as pessoas por 
suas alturas em uma ordem não descendente sem mover as árvores. As 
pessoas podem ser muito altas!
---Comentários/ Comments---
Make an algorithm to put an array in ascending order, not changing the position of -1

Faça um algoritmo para colocar em ordem crescente um array, não mudando a posição do -1
***/

public class sortByHeight {
    public static void main(String[] args){
        System.out.println(sortByHeight(new int[]{1,3,2,4,-1,6,8,3,5}));
    }

    static int[] sortByHeight(int[] a){
        int[] aux = new int[a.length];

        for(int i = 0; i < a.length-1; i++){
            for(int j = 1; j < a.length-i; j++){
                if(a[i] > a[j+i] && a[j+i] != -1 && a[i] != -1) {
                    aux[i] = a[i];
                    a[i] = a[j+i];
                    a[j+i] = aux[i];
                }
            }
        }
        return a;
    }
}
