package array_2D;
//print array by using enhanced for loop
public class C4 {
	public static void main(String[] args) {
		int [][]arr = {
				{10},
				{11,99,23},
				{44,42},
				{50,60,61,67}
		};
		for(int[] a1: arr) {
			for(int a : a1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
