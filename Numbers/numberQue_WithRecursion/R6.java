package numberQue_WithRecursion;
//FIND FACTORIAL OF 6
public class R6 {
	static int fact= 1;
	static int num = 6;
	public static void main(String[] args) {
		print1();
		System.out.println("Print fact : "+fact);
	}
	
	public static void print1() {
		if(num!=0) {
			fact=fact*num;
			--num;
			print1();
		}	
	}
}
