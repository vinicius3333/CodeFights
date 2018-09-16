package CodeFights.The_Core.Intro_Gates;

/*** 
---Pergunta/ Question---
Your friend advised you to see a new performance in the most popular theater in the city. He knows a lot about art and his advice 
is usually good, but not this time: the performance turned out to be awfully dull. It's so bad you want to sneak out, which is
quite simple, especially since the exit is located right behind your row to the left. All you need to do is climb over your seat 
and make your way to the exit.
The main problem is your shyness: you're afraid that you'll end up blocking the view (even if only for a couple of seconds) of 
all the people who sit behind you and in your column or the columns to your left. To gain some courage, you decide to calculate 
the number of such people and see if you can possibly make it to the exit without disturbing too many people.
Given the total number of rows and columns in the theater (nRows and nCols, respectively), and the row and column you're 
sitting in, return the number of people who sit strictly behind you and in your column or to the left, assuming all seats are 
occupied.

Seu amigo aconselhou você a ver um novo desempenho no teatro mais popular da cidade. Ele sabe muito sobre arte e seus conselhos 
costumam ser bons, mas não dessa vez: a performance acabou sendo muito chata. É tão ruim que você quer fugir, o que é bastante 
simples, especialmente porque a saída está localizada logo atrás da sua linha à esquerda. Tudo que você precisa fazer é subir em
seu assento e fazer o seu caminho até a saída.
O principal problema é a sua timidez: você tem medo de acabar bloqueando a visualização (mesmo que por apenas alguns segundos) de 
todas as pessoas que estão sentadas atrás de você e em sua coluna ou das colunas à sua esquerda. Para ganhar coragem, você decide 
calcular o número dessas pessoas e ver se consegue chegar à saída sem incomodar muita gente.
Dado o número total de linhas e colunas no teatro (nRows e nCols, respectivamente), e a linha e coluna em que você está sentado,
retorne o número de pessoas sentadas estritamente atrás de você e em sua coluna ou à esquerda, supondo todos os assentos estão
ocupados.
---Comentários/ Comments---
Make an algorithm that returns the amount of people who will be affected by you leaving the movie theater.

Faça um algoritmo que retorne a quantidade de pessoas que serão afetadas por você sair do cinema.
***/

public class Seats_in_Theater {
    public static void main(String[] args) {
        System.out.println(seatsInTheater(16, 11, 5, 3));
    }

    static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - (col-1)) * (nRows - row);
    }

}
