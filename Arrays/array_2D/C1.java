package array_2D;
//PRINT ARRAY BY USING FOR LOOP....!!
public class C1 {
	public static void main(String[] args) {
		int [][]arr = {
				{10,11,12},
				{13,14,15},
				{16,17,18}
		};
		for(int i =0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
