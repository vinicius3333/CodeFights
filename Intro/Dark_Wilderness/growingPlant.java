package codeFighters;

public class growingPlant {
	public static void main(String[] args) {
		System.out.println(growingPlant(100,10,910));
	}
	static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
	    int c = 0;
		int p = 0;
		while(p <= desiredHeight){
			p += upSpeed;
	        c++;
	        if(p>=desiredHeight) return c;
			p -= downSpeed;
		}
		return c==0 ? 1 : c;
	}
}
