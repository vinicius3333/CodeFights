package CodeFights.The_Core.Loop_Tunnel;

public class Lineup {
    public static void main(String[] args){
        System.out.println(lineUp("LLARL"));
    }

    static int lineUp(String commands) {
        int r = 0;
        boolean pair = true;

        for (int i = 0; i < commands.length(); i++) {
            char c = commands.charAt(i);
            if ((c == 'L' || c == 'R')) {
                if(!pair)
                    r++;
                pair = !pair;
            } else{
                if(pair)
                    r++;
            }
        }

        return r;
    }
}
