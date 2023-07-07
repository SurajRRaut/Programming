package numberQue_WithRecursion;
//PRINT FIBONNACCI SERIES USING RECURSION
public class R2 {
	static int a = 0;
	static int b = 1;
	public static void main(String[] args) {
		printFib(0);
	}
	public static void printFib(int x) {
		
		if(x<10) {
			System.out.print(a+" ");
			int c = a+b;
			a=b;
			b=c;
			printFib(++x);
		}	
	}
}
