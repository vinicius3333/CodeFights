package CodeFights.The_Core.Book_Market;

public class Find_Email_Domain {
    public static void main(String[] args) {
        System.out.println(findEmailDomain("teste@teste.com"));
    }

    static String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf("@")+1);
    }

}
