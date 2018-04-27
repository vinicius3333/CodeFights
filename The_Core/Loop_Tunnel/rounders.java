package CodeFights.The_Core.Loop_Tunnel;

public class rounders {
    public static void main(String[] args) {
        System.out.println(rounders(15));
    }

    static int rounders(int value) {
        StringBuilder str = new StringBuilder(String.valueOf(value));
        int newValue = value, c, ant;

        for(int i = 1; i < str.length(); i++){
            c = (int)str.charAt(str.length()-i)-48;
            if(c >= 5){
                ant = 10 - c;
                ant *= (int)Math.pow(10,i-1);
                newValue = Integer.parseInt(String.valueOf(str)) + ant;
                str = new StringBuilder(String.valueOf(newValue));
            } else{
                str.setCharAt(str.length()-i, '0');
                newValue = Integer.parseInt(String.valueOf(str));
            }
        }

        return newValue;
    }

}
