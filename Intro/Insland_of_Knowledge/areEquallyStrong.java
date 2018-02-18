package CodeFights.Intro.Insland_of_Knowledge;

public class areEquallyStrong {
    public static void main(String[] args){
        System.out.println(areEquallyStrong(15,10,15,9));
    }

    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight){
        return((yourLeft + yourRight) == (friendsLeft + friendsRight) && Math.abs(yourLeft-yourRight) == Math.abs(friendsLeft-friendsRight));
        /***
         *Verifica se a soma dos braços são iguais e se a diferença de cada indivíduo é igual;
         */
    }
}
