package numberQue;
//CHECK NUMBER IS NEON OR NOT !!.......................(ONLY 3 NEON IS IN WHOLE NUMBER SYSTEM WHICH IS >>>>> 0,1,9)
public class N17 {
	public static void main(String[] args) {
		int num = 9;
		int sqrt =num*num;
		int add = 0;
		while(sqrt!=0) {
			int rem = sqrt%10;
			add+=rem;
			sqrt/=10;
		}
		if(num==add) {
			System.out.println("Yes its NEON numberr");
		}
		else {
			System.out.println("No its not an NEON number");
		}
	}
}
