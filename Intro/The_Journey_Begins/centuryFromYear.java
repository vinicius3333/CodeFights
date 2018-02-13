package CodeFights.Intro.The_Journey_Begins;

public class centuryFromYear {

    public static void main(String[] args){
        System.out.println(centuryFromYear(2));
    }

    static int centuryFromYear(int year){
        if(year%100 != 0){            //Verifica se o ano não é um século exato, se ele realmente não for |
            year += 100 - (year%100); //soma o restante para formar um século exato e retorna o século    |
            return year/100;          //Exemplo: year: 56| 56 != 0 --- 56 += 100 - 56 --- 56 += 44        |  
        }                             //retorna 1 que é o século que 56 está situado.                     |
        else return year/100;         //==================================================================|
    }                                 // Verify that the year is not an exact century, if it really is not|
}                                     // sum the rest to form an exact century and the century returns    |
                                      // Example: year: 56 | 56! = 0 --- 56 + = 100 - 56 --- 56 + = 44    |
                                      // returns 1 which is the century that 56 is situated. 			  |
