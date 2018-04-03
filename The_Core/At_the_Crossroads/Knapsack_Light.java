package CodeFights.The_Core.At_the_Crossroads;

public class Knapsack_Light {
    public static void main(String[] args){

    }

    static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        return weight1 + weight2 <= maxW ? value1+value2 : weight1 > maxW && weight2 > maxW ? 0 :(value1 > value2 ? (weight1 <= maxW ? value1 : value2) : (weight2 <= maxW ? value2 : value1));
    }

}
