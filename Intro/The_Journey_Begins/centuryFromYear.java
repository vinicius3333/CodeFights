package CodeFights.Intro.The_Journey_Begins;

public class centuryFromYear {

    public static void main(String[] args){
        System.out.println(centuryFromYear(2));
    }

    static int centuryFromYear(int year){
        if(year%100 != 0){
            year += 100 - (year%100);
            return year/100;
        }
        else return year/100;
    }
}