package array_1D;
import java.util.Random;
//CREATE A RANDOM ARRAY
public class RandomArray {
	static Random rd = new Random();
	
	public static int[]getArray(int size){
		int [] arr = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i]=rd.nextInt(50);
		}
		return arr;
	}
}
