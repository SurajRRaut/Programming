package numberQue_WithRecursion;
//Print SURAJ 5 times
public class R3 {
	static int a = 0;
	public static void main (String[]args) {
		printSuraj();
	}
	public static void printSuraj() {
		if(a<5) {
			System.out.println("Suraj");
			++a;
			printSuraj();
			
		}
		
	}
}