package CodeFights.The_Core.Loop_Tunnel;

public class Addition_Without_Carrying {
    public static void main(String[] args) {
        System.out.println(additionWithoutCarrying(456, 1734));
    }

    static int additionWithoutCarrying(int param1, int param2) {
        String str = String.valueOf(param1);
        String str2 = String.valueOf(param2);
        int length = 0, sum, r;
        String result = "";

        if(str.length() == str2.length()) length = str.length();
        else if(str.length() > str2.length()) length = str.length();
        else length = str2.length();

        for(int i = 0; i < length; i++){
            if(str.length()-1-i == -1)sum = str2.charAt(str2.length()-1-i)-48;
            else if(str2.length()-1-i < 0) sum = str.charAt(str.length()-1-i)-48;
            else sum = str.charAt(str.length()-1-i)-48 + str2.charAt(str2.length()-1-i)-48;

            result = String.valueOf(sum).substring(String.valueOf(sum).length()-1) + result;
        }
        r = Integer.parseInt(result);
        return r;
    }
}
