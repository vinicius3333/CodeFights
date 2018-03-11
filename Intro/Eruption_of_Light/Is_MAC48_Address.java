package CodeFights.Intro.Eruption_of_Light;

public class Is_MAC48_Address {
    public static void main(String[] args) {
        System.out.println(isMAC48Address("00-1B-63-84-45-E6"));
    }

    static boolean isMAC48Address(String inputString) {
        String myRegex = "^[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}[-]{1}[0-9A-F]{2}";
        return inputString.matches(myRegex);
    }
}
