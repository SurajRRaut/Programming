package array_2D;
//find sum of each element.............compare that...... and print max of that elements
public class C5 {
	public static void main(String[] args) {
		int [][]arr = {
				{101,99,500},
				{200,199,299},
				{150,100,90,80,20,20,20}
		};
		
		int max=arr[0][0];
		int frd=0;
		for(int i =0;i<arr.length;i++) {
			
			int sum = 0;
			for(int j = 0;j<arr[i].length;j++) {
				sum +=arr[i][j];	
			}
			System.out.println(sum);
			if(sum>max) {
				max=sum;
				frd=i;
			}
		}
		System.out.println("max amt taken friend no is : "+ (frd+1));
		System.out.println("THE amt TAKEN IS : "+ max);
	}
}

