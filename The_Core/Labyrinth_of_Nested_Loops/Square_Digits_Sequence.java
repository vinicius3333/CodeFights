package CodeFights.The_Core.Labyrinth_of_Nested_Loops;

import java.util.ArrayList;

public class Square_Digits_Sequence {

    public static void main(String[] args) {
        System.out.println(squareDigitsSequence(16));
    }

    static int squareDigitsSequence(int a0) {
        int cur = a0;
        ArrayList<Integer> was = new ArrayList<>();

        while (!was.contains(cur)) {
            was.add(cur);
            int next = 0;
            while (cur > 0) {
                next += (cur % 10) * (cur % 10);
                cur /= 10;
            }
            cur = next;
        }

        return was.size() + 1;
    }
}
