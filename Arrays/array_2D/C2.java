package array_2D;
//declare 2D array and find the greatest array from that array
public class C2 {
	public static void main(String[] args) {
		int [][]arr = {
				{10,11,12},
				{13,14,15},
				{16,17,18}
		};
		int max = arr[0][0];// take value from array
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(arr[i][j]<max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("THE MAXIMUM ELEMENT IS : "+ max);
	}
}
