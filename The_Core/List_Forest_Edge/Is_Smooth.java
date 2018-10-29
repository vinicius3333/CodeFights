package CodeFights.The_Core.List_Forest_Edge;

/*** 
---Pergunta/ Question---
We define the middle of the array arr as follows:
if arr contains an odd number of elements, its middle is the element whose index number is the same when counting from the 
beginning of the array and from its end;
if arr contains an even number of elements, its middle is the sum of the two elements whose index numbers when counting from
the beginning and from the end of the array differ by one.
An array is called smooth if its first and its last elements are equal to one another and to the middle. Given an array arr, determine if it is smooth or not.

Nós definimos o meio da matriz arr como segue:
se arr contiver um número ímpar de elementos, seu meio é o elemento cujo número de índice é o mesmo ao contar a partir do início 
do array e do seu final;
se arr contiver um número par de elementos, seu meio é a soma dos dois elementos cujos números de índice, quando contados a 
partir do início e do final da matriz, diferem em um.
Um array é chamado smooth se o primeiro e último elementos forem iguais entre si e ao meio. Dado um array, determine se é bom ou não.
---Comentários/ Comments---
Make an algorithm to check if the array is smooth.

Faça um algoritmo para verificar se a array é smooth.
***/

public class Is_Smooth {
    public static void main(String[] args) {
        System.out.println(isSmooth(new int[]{7, 2, 2, 5, 10, 7}));
    }

    static boolean isSmooth(int[] arr) {
        if(arr.length%2==0){
            if(arr[0] == arr[arr.length-1]){
                return arr[0] == (arr[(arr.length/2)-1] + arr[arr.length/2]);
            }
            return false;
        }
        return arr[0] == arr[arr.length-1] ? (arr[0] == arr[arr.length/2]) : false;
    }

}
