package array_1D;
//ROTATE THE ARRAY
public class A11 {
	public static void main (String[]args) {
		int arr[]= {10,11,12,13,14};
		int n = 3;
		while(n>0) { //while loop taking for rotating multiple times..
			
			int last =arr[arr.length-1];
			for(int x : arr) {
				System.out.println(x);
			}
			
			System.out.println("-------------------");
			
			for(int i = arr.length-1;i>0;i--) {
			
					arr[i]=arr[i-1];			
			}
			arr[0]=last;//rotating single time array
			n--;
		}
		 
		for(int x : arr) {
			System.out.println(x);
		} 
	}
}