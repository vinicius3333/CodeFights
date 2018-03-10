package CodeFights.Intro.Eruption_of_Light;

public class Elections_Winner {
    public static void main(String[] args) {
        System.out.println(electionsWinners(new int[]{1,2,3},3));
    }

    static int electionsWinners(int[] votes, int k) {
        int count, count2 = 0;
        for(int i = 0; i < votes.length; i++){
            count = 0;
            for(int j = 0; j < votes.length; j++){
                if(votes[i]+k > votes[j] && i != j){
                    count++;
                } else if(i != j){
                    break;
                }
            }
            if(count == votes.length-1){
                count2++;
            }
        }
        return count2;
    }
}
