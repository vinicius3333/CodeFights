package CodeFights.The_Core.Corner_of_0s_and_1s;

public class Swap_Adjacents_Bits {
    public static void main(String[] args){
        System.out.println(swapAdjacentBits(13));
    }

    static int swapAdjacentBits(int n) {
        return ((0b01010101010101010101010101010101 & n) << 1) + ((0b10101010101010101010101010101010 & n) >> 1) ;
    }

}
