package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

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
