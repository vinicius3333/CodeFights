package CodeFights.The_Core.Loop_Tunnel;

public class Apple_Boxes {
    public static void main(String[] args) {
        System.out.println(appleBoxes(5));
    }

    static int appleBoxes(int k) {
        int y = 0, r = 0, ant;

        for(int i = 1; i <= k; i++){
            if(i%2!=0 && y > 0){
                ant = i;
                y += (ant*ant);
            } else if(y == 0) y = 1;
            if(i%2==0){
                ant = i;
                r += (ant*ant);
            }
        }

        return r - y;
    }
}
