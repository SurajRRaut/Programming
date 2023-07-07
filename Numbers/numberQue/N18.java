package numberQue;
//CHECK NUMBER IS ARMSTRONG NUMBER OR NOT !!!
public class N18 {
	public static void main(String[] args) {
		int num1 = 153;//take power for every digit the size of number ex: 3 digits are there so take power : 3
		int num = num1;
		int add = 0;
		while(num!=0) {
			int rem = num%10;
			int root = rem*rem*rem;
			add+=root;
			num/=10;
		}
		if(num1==add) {
			System.out.println("Yes its ARMSTRONG numberr");
		}
		else {
			System.out.println("No its not an ARMSTRONG number");
		}
	}
}

