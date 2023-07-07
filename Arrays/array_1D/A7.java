package array_1D;
//METHOD 1 :
//FIND ALL MINIMUM OF ARRAY 1 BY 1 AND SWAP IT AND SORT IT BY ARRAY SELECTION SORT
public class A7 {
	public static void main (String[]args) {
		int arr[]=RandomArray.getArray(5);
		
		for(int x : arr) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		
		for(int j = 0;j<arr.length;j++) { 
			 
			int indArr = j;
			
			for(int i = j;i<arr.length;i++) {
				if(arr[i]<arr[indArr]) {
					indArr=i;
				}
			}
			 
			int temp = arr[indArr];
			arr[indArr]=arr[j];
			arr[j]=temp; 
		}
		 
		for(int x : arr) {
			System.out.println(x);
		} 
	}
}
