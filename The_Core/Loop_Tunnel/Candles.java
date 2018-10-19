package CodeFights.The_Core.Loop_Tunnel;

/*** 
---Pergunta/ Question---
When a candle finishes burning it leaves a leftover. makeNew leftovers can be combined to make a new candle, which, when burning 
down, will in turn leave another leftover.
You have candlesNumber candles in your possession. What's the total number of candles you can burn, assuming that you create new
candles as soon as you have enough leftovers?

Quando uma vela termina de queimar deixa uma sobra. makeNew sobras podem ser combinadas para fazer uma nova vela, que, ao 
queimar, por sua vez, deixará outra sobra.
Você tem candlesNumber velas em sua posse. Qual é o número total de velas que você pode gravar, presumindo que você crie novas
velas assim que tiver sobras suficientes?
---Comentários/ Comments---
Make an algorithm that returns how many candles are possible with the candles already made and with the leftovers.

Faça um algoritmo que retorne quantas velas são possíveis fazer com as velas já feitas e com as sobras.
***/

public class Candles {
    public static void main(String[] args){
        System.out.println(candles(5,2));
    }

    static int candles(int candlesNumber, int makeNew) {
        int leftovers = 0, result = 0;

        while(candlesNumber > 0){
            System.out.println(candlesNumber + " " + leftovers);
            result += candlesNumber;
            leftovers += candlesNumber;
            candlesNumber -= candlesNumber;
            while(leftovers >= makeNew){
                candlesNumber++;
                leftovers -= makeNew;
            }
        }
        return result;
    }

}
