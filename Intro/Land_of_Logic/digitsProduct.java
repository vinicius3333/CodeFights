package CodeFights.Intro.Land_of_Logic;

public class digitsProduct {
    public static void main(String[] args) {
        System.out.println(digitsProduct(12));
    }

    static int digitsProduct(int product) {

        for(int i = 0; i < 10000; i++){
            if(product(i) == product) return product(i);
        }

        return -1;
    }

    static int product(int n){

        int prod = 1;

        while(n > 1){
            prod *= n % 10;
            n = (int) Math.floor(n / 10);
        }

        return prod;
    }

}
