package array_1D;
//BUBBLE SORT
public class A9 {
	public static void main (String[]args) {
		int arr[]=RandomArray.getArray(5);
		
		for(int x : arr) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1-i;j++) { 
				 if(arr[j]>arr[j+1]) {
					 int temp = arr[j+1];
					 arr[j+1]=arr[j];
					 arr[j]=temp;
				 }
			}
		}
		 
		for(int x : arr) {
			System.out.println(x);
		} 
	}
}

