package CodeFights.Intro.Diving_Deeper;

public class firstDigit {
    public static void main(String[] args) {
        System.out.println(firstDigit("var_1__Int"));
    }

    static char firstDigit(String inputString){
        for(int i = 0; i < inputString.length(); i++){
            if(Character.isDigit(inputString.toCharArray()[i])){
                return inputString.toCharArray()[i];
            }
        }
        return '0';
    }
}
