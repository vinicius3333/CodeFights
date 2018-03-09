package CodeFights.Intro.Eruption_of_Light;

public class Find_Email_Domain {
    public static void main(String[] args) {
        System.out.println(findEmailDomain("<>[]:,;@\\\"!#$%&*+-/=?^_{}| ~.a\\\"@example.org"));
    }

    static String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf("@")+1, address.length());
    }
}
