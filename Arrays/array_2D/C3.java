package array_2D;
//FIND MAX ELEMENT FROM ARRAY
public class C3 {
	public static void main(String[] args) {
		int [][]arr = {
				{10},
				{11,99,23},
				{44,42},
				{50,60,61,67}
		};
		int max = arr[0][0];// take value from array
		
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("THE MAXIMUM ELEMENT IS : "+ max);
	}
}
