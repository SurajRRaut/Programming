package numberQue;
//print PALINDROMS between 100 - 1000000
public class N13 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 100;i<=1000000;i++) {
			int num = i;
			int rev = 0;
			while(num!=0) {
				int rem = num%10;
				num=num/10;
				rev = rev*10+rem;
			}
			if(i==rev) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total palindrome is : "+ count);
	}
}
