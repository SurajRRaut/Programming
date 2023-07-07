package array_1D;
//MERGE THAT TWO ARRAY IN ONE ARRAY WITH RETURN THE ARRAY WHICH IS AN MERGED ARRAY.....
public class A13 {
	static A13 a = new A13();
	public static void main(String[] args) {
		
		int arr1[]= {10,20,30,40};
		int arr2[]= {50,60,70};
		
		int output[] = a.mergeArray(arr1, arr2);
		for(int c : output) {
			System.out.print(c+" ");
		}	
	}
	public int [] mergeArray(int[]arr1,int[]arr2) {
		int a = arr1.length;
		int b = arr2.length;
		int arr3[]=new int[a+b];
		int indX=0;
		for(int x :arr1) {
				arr3[indX++] = x;
		}
		for(int x :arr2) {
			arr3[indX++] = x;
		}
		
		return arr3;
	}
}

