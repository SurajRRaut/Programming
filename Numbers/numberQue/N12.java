package numberQue;
//Check NUM PALINDROME OR NOT !!
public class N12 {
	public static void main(String[] args) {
		int num1 = 12321;
		int num = num1;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			num/=10;
			rev = rev*10+rem;
		}
		if(num1==rev) {
			System.out.println("Yes its Plaindrome number");
		}
		else {
			System.out.println("No its not an palindrome number");
		}
	}
}
