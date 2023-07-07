package array_1D;
//FIND SUM || CHECK IF SUM IS EVEN OR ODD ||  I SUM IS ODD REPLACE ANY ONE VALUE OF ARRAY SO THAT SUM WILL BE EVEN  
public class A4 {
	public static void main(String[] args) {
		int []arr = {10,11,12,13,14,25,16};
		int sum =0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(sum%2==0) {
			System.out.println("sum is even");;
		}
		else {
			System.out.println("sum is odd");
			arr[0]=arr[0]+1;
		}
		sum=0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		if(sum%2==0) {
			System.out.println("sum is even");;
		}
		else {
			System.out.println("sum is odd");
		}
	}
}
