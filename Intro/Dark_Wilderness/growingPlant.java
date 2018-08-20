package codeFighters;

/*** 
---Pergunta/ Question---
Each day a plant is growing by upSpeed meters. Each night that plant's height decreases by downSpeed meters due to the lack of sun
heat. Initially, plant is 0 meters tall. We plant the seed at the beginning of a day. We want to know when the height of the plant 
will reach a certain level.

Cada dia uma planta está crescendo por medidores upSpeed. Cada noite que a altura da planta diminui em metros downSpeed devido à 
falta de sol calor. Inicialmente, a planta tem 0 metros de altura. Nós plantamos a semente no começo do dia. Queremos saber quando
a altura da planta atingirá um certo nível.
---Comentários/ Comments---
Make an algorithm that has a value grow according to the upSpeed variable and decrease with the downSpeed, when it reaches or 
passes the desiredHeight, return the value of times that the plant has grown

Faça um algoritmo que tenha um valor cresça de acordo com a variável upSpeed e diminua com a downSpeed, quando chegar ou passar do
desiredHeight, retorne o valor de vezes que a planta cresceu
***/

public class growingPlant {
	public static void main(String[] args) {
		System.out.println(growingPlant(100,10,910));
	}
	static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
	    int c = 0;
		int p = 0;
		while(p <= desiredHeight){
			p += upSpeed;
	        c++;
	        if(p>=desiredHeight) return c;
			p -= downSpeed;
		}
		return c==0 ? 1 : c;
	}
}
