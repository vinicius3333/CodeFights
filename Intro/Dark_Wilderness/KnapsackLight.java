package codeFighters;

public class KnapsackLight {
	public static void main(String[] args) {
		System.out.println(knapsackLight(10,5,6,4,8));
	}
	static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
		 if(weight1+weight2<=maxW){
				return value1+value2;
		 } 
		 else if(value1 > value2){
			 if(weight1 <= maxW){
				 return value1;
				 } 
			 else{
				 return value2;
				 }
		 }
		 else{
			 if(weight2 <= maxW){
				 return value2;
				 }
			 else{
				return value1;
				}
		}
	}
}
