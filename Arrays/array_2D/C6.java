package array_2D;
public class C6{
	public static void main(String[] args) {
		int arr[][] = {
				{10,11,12},       //output = int arr[][]= {{10,13,16},
				{13,14,15},       //                       {11,14,17},
				{16,17,18}        //       			       {12,15,18 }};
		};
		
		for(int j = 0;j<arr.length;j++) {
			for(int i = 0;i<arr[j].length;i++) {
				System.out.print(arr[i][j]+" ");
				arr[i][j]=arr[j][i];
			}
			System.out.println();
		}
	}
}
