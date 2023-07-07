package numberQue_WithRecursion;
//PRINT 9 - 0 NUMBERS
public class R4 {
	public static void main(String[] args) {
		print1(9);
	}
	
	public static void print1(int a) {
		if(a>=0) {
			System.out.println(a);
			print1(--a);
		}	
	}
}
