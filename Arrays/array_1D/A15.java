package array_1D;
//CHECK ARRAY WETHER SORTED MANNER OR NOT !?
public class A15 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,5,6};
		boolean output =checkSort(arr);
		if(output) {
			System.out.println("Array is Sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}
	
	public static boolean checkSort(int []arr) {
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
}
