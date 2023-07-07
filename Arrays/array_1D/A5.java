package array_1D;
import java.util.Arrays;
//FIND THE MINIMUM OF ARRAY AND MAXIMUIM O ARRAY BY USING SORT METHOD
public class A5 {
	public static void main(String[] args) {
		int[]arr=RandomArray.getArray(10);
		Arrays.sort(arr);
		
		for(int i = 0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		System.out.println("Minimum O Array : "+arr[0]);
		System.out.println("Maximum Of Array : "+arr[arr.length-1]);
		System.out.println(Arrays.toString(arr));//the function is use for print array...!!
	}	
}
