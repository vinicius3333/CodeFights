package CodeFights.The_Core.Intro_Gates;

/*** 
---Pergunta/ Question---
One night you go for a ride on your motorcycle. At 00:00 you start your engine, and the built-in timer automatically begins counting the
length of your ride, in minutes. Off you go to explore the neighborhood. When you finally decide to head back, you realize there's a
chance the bridges on your route home are up, leaving you stranded! Unfortunately, you don't have your watch on you and don't know what 
time it is. All you know thanks to the bike's timer is that n minutes have passed since 00:00. Using the bike's timer, calculate the 
current time. Return an answer as the sum of digits that the digital timer in the format hh:mm would show.

Uma noite você vai dar uma volta na sua moto. Às 00:00 você liga o motor e o temporizador interno começa a contar automaticamente
duração do seu passeio, em minutos. Você vai explorar o bairro. Quando você finalmente decide voltar, você percebe que há um
acaso as pontes em sua rota para casa estão em alta, deixando você encalhado! Infelizmente, você não tem o seu relógio em você e não 
sabe o que o tempo é. Tudo o que você sabe, graças ao cronômetro da moto, é que n minutos se passaram desde as 00:00. Usando o 
cronômetro da bicicleta, calcule a hora atual. Retorna uma resposta como a soma dos dígitos que o timer digital no formato hh: mm 
mostraria.
---Comentários/ Comments---
Make an algorithm to add all the digits of the stopwatch in the format "## - ##".

Faça um algoritmo para somar todos os dígitos do cronômetro  no formato "##-##".
***/

public class Late_Ride {
    public static void main(String[] args){
        System.out.println(lateRide(4));
    }

    static int lateRide(int n) {
        int h = n/60;
        int m = n%60;
        String hS = String.valueOf(h);
        String mS = String.valueOf(m);

        if(hS.length() < 2) hS = "0" + hS;
        if(mS.length() < 2) mS = "0" + mS;

        return Integer.parseInt(hS.substring(0,1)) + Integer.parseInt(hS.substring(1,2))
                + Integer.parseInt(mS.substring(0,1)) + Integer.parseInt(mS.substring(1,2));
    }
}
