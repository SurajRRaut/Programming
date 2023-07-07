package array_1D;
//PRINT EVEN POSITION ARRAY
public class A1 {
	public static void main(String[] args) {
		int []arr = {10,11,12,13,14,25,16};
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
