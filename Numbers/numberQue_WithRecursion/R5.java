package numberQue_WithRecursion;
//print table of 2
public class R5 {
	static int a = 2;
	public static void main(String[] args) {
		print1();
	}
	public static void print1() {
		if(a<21) {
			System.out.println(a);
			a=a+2;
			print1();
		}	
	}
}