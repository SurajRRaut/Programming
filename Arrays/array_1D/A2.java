package array_1D;
//PRINT REVERSE OF ARRAY
public class A2 {
	public static void main(String[] args) {
		int []arr = {10,11,12,13,14,25,16};
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
