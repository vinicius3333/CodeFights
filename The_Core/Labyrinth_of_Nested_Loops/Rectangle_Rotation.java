package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

/*** 
---Pergunta/ Question---
A rectangle with sides equal to even integers a and b is drawn on the Cartesian plane. Its center (the intersection point of its
diagonals) coincides with the point (0, 0), but the sides of the rectangle are not parallel to the axes; instead, they are forming
45 degree angles with the axes.
How many points with integer coordinates are located inside the given rectangle (including on its sides)?

Um retângulo com lados iguais aos números inteiros aeb é desenhado no plano cartesiano. Seu centro (o ponto de interseção de suas
diagonais) coincide com o ponto (0, 0), mas os lados do retângulo não são paralelos aos eixos; em vez disso, eles estão formando
ângulos de 45 graus com os eixos.
Quantos pontos com coordenadas inteiras estão localizados dentro do retângulo dado (incluindo nos lados)?
---Comentários/ Comments---
Make an algorithm to count the green points of the plane.

Faça um algoritmo para contar os pontos verdes do plano.
***/

public class Rectangle_Rotation {
    public static void main(String[] args){
        System.out.println(rectangleRotation(6,4));
    }

    static int rectangleRotation(int a, int b) {
        int r = 0;
        for (int x = -a - b; x != a + b; x++) {
            for (int y = -a - b; y != a + b; y++) {
                if (2 * (x - y) * (x - y) < a * a && 2 * (x + y) * (x + y) < b * b)
                    r++;
            }
        }
        return r;
    }
}
