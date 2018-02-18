package CodeFights.Intro.Insland_of_Knowledge;

public class isIPv4Adress {
    public static void main(String[] args){
        System.out.println(isIPv4Adress(".16.254.1"));
    }

    static boolean isIPv4Adress(String inputString){
        String IPV4_REGEX = "\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z";
        return inputString.matches(IPV4_REGEX);
        //return inputString.matches("\\A(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}\\z");
        /**
         * Expressão regular IPv4;
         */
    }
}
