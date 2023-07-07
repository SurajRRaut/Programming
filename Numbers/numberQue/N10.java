package numberQue;
//FIND FACTORIAL OF 6
public class N10 {
	public static void main(String[] args) {
		int a = 6;
		int fact = 1;
		while(a!=0) {
			fact*=a;
			a--;
		}
		System.out.println("Factorial is : "+fact);
	}
}
