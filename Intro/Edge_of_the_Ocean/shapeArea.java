package CodeFights.Intro.Edge_of_the_Ocean;

/*** 
---Pergunta/ Question---
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1.
An n-interesting polygon is obtained by taking the n - 1-interesting polygon
and appending 1-interesting polygons to its rim, side by side. 
You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
https://codefightsuserpics.s3.amazonaws.com/tasks/shapeArea/img/area.png?_tm=1491302317375

Um polígono interessante é apenas um quadrado com um lado de comprimento 1.
Um polígono n-interessante é obtido tomando-se o polígono interessante de n-1
e anexando 1 polígonos interessantes ao seu aro, lado a lado.
Você pode ver os polígonos de 1, 2, 3 e 4 interessantes na figura abaixo.
https://codefightsuserpics.s3.amazonaws.com/tasks/shapeArea/img/area.png?_tm=1491302317375
---Comentários/ Comments---
Just find the pattern and make an algorithm that calculates the result.

Apenas encontre o padrão e faça um algoritmo que calcule o resultado
***/

public class shapeArea {
    public static void main(String[] args){
        System.out.println(shapeArea(100));
    }

    static int shapeArea(int n){
        int shape = 1;
        for(int i = 1; i < n; i++){
            shape += 4*i;
        }
        return shape;
    }
}
