package numberQue;
//CHECK 2114 IS SPY NUMBER OR NOT !!
public class N14 {
	public static void main(String[] args) {
		int num = 2114;
		int add = 0;
		int mult = 1;
		while(num!=0) {
			int rem = num%10;
			add+=rem;
			mult*=rem;
			num/=10;
		}
		if(add==mult) {
			System.out.println("Yes its SPY number");
		}
		else {
			System.out.println("No its not an SPY number");
		}
	}
}
