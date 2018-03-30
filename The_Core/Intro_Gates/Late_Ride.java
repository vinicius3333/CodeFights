package CodeFights.The_Core.Intro_Gates;

public class Late_Ride {
    public static void main(String[] args){
        System.out.println(lateRide(4));
    }

    static int lateRide(int n) {
        int h = n/60;
        int m = n%60;
        String hS = String.valueOf(h);
        String mS = String.valueOf(m);

        if(hS.length() < 2) hS = "0" + hS;
        if(mS.length() < 2) mS = "0" + mS;

        return Integer.parseInt(hS.substring(0,1)) + Integer.parseInt(hS.substring(1,2))
                + Integer.parseInt(mS.substring(0,1)) + Integer.parseInt(mS.substring(1,2));
    }
}
