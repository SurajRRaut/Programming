package array_1D;
//FIND SUM OF ARRAY
public class A3 {
	public static void main(String[] args) {
		int []arr = {10,11,12,13,14,25,16};
		int sum =0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sumation of array : "+sum);
	}
}

