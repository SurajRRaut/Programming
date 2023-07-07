package numberQue_WithRecursion;
//PRINT 10 TIMES HELLO USING RECURSION
public class R1 {
	public static void main(String[] args) {
		printHello(0);
	}
	
	public static void printHello(int a) {
		if(a<10) {
			System.out.println("hello");
			printHello(++a);
		}	
	}
}
