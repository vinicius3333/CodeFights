package CodeFights.Intro.Edge_of_the_Ocean;

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
