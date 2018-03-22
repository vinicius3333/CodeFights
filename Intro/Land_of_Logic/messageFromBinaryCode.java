package CodeFights.Intro.Land_of_Logic;

public class messageFromBinaryCode {
    public static void main(String[] args) {

    }

    static String messageFromBinaryCode(String code) {
        int bin, div = code.length() / 8, test = 8, test2 = 0;
        StringBuilder s = new StringBuilder();

        while(div-- > 0){
            bin = Integer.valueOf(code.substring(test2,test), 2);
            System.out.println(bin);

            s.append(Character.toChars(bin));

            test += 8;
            test2 += 8;
        }

        return s.toString();
    }

}
