package array_1D;
//DISPLAY THE PAIRS OF SUM OF 70 FROM GIVEN ARRAY WITH NOT REPEATING THE SAME PAIR.........!!!
public class A12 {
		public static void main(String[] args) {
			int arr[] = {10,20,30,40,50,60};
			
			for(int i = 0;i<arr.length;i++) {
				
				for(int j = i+1;j<arr.length;j++) {
				
					if((arr[i]+arr[j])==70) {
						System.out.print(arr[i]+" ");
						System.out.print(arr[j]);
					}
				}
			System.out.println();
		}	
	}
}
