package codeFighters;

public class DigitDegree {
	public static void main(String[] args) {
		System.out.println(digitDegree(91));
	}
	
	static int digitDegree(int n) {
		String str = String.valueOf(n);
		int sum = 0, leftPart, rightPart, c = 0;
		while(str.length()!=1){
			sum = 0;
			for(int i = 0; i < str.length(); i++){
				sum += str.toCharArray()[i]-48;
			}
			str = String.valueOf(sum);
			c++;
		}
		return c;
	}
}
