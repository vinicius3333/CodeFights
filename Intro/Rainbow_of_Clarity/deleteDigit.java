package CodeFights.Intro.Rainbow_of_Clarity;

public class deleteDigit {
    public static void main(String[] args) {
        System.out.println(deleteDigit(152));
    }

    static int deleteDigit(int n) {
        int maior = 0;
        int sum;
        int con;
        String str = String.valueOf(n);
        StringBuffer str2 = new StringBuffer(str);

        for(int i = 0; i < str.length(); i++){
            str2.deleteCharAt(i);
            con = Integer.parseInt(String.valueOf(str2));
            sum = con;
            if(sum > maior){
                maior = sum;
            }
            str2 = new StringBuffer(str);
        }
        return maior;
    }
}
