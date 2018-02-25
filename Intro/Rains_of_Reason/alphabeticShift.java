package CodeFights.Intro.Rains_of_Reason;

public class alphabeticShift {
    public static void main(String[] args){
        System.out.print(alphabeticShift("teste"));
    }

    static String alphabeticShift(String inputString){
        char[] ch = inputString.toCharArray();
        int t = 0;

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'z'){
                ch[i] = 'a';
            } else{
                t = (int) ch[i];
                t++;
                ch[i] = (char) t;
            }
        }
        inputString = new String(ch);
        return inputString;
    }
}
