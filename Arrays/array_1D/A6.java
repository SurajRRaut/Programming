package array_1D;
//FIND MINIMUM OF ARRAY AND SWAP IT BY FIRST POSITION
public class A6 {
	public static void main(String[] args) {
		
		int[]arr= RandomArray.getArray(5);
		int minValue = arr[0];//prefer any  1 element.
		int minIndex = 1;//prefer any 1 index.
		
		for(int a :arr) {
			System.out.println(a);
		}	
		
		//THIS < CONDITION FOR MIN ARRAY REPLACE THIS WITH > FOR MAX OF ARRAY....!!
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		for(int j = 0;j<arr.length;j++) {
				
			if(arr[j]<arr[minIndex]) {
				minIndex=j;
			}	
		}
		
		System.out.println("Minimum Of Array : "+ minValue);
		System.out.println("minimum index of array "+minIndex);
		
		 //By using withdrawing only array index only
		 int temp = arr[minIndex];
		 arr[minIndex]=arr[0];
		 arr[0]=temp;
		 
		 System.out.println("------------------------------------");
		 //by using withdrawing both array index and min of array;
		 //arr[indArr]=arr[0];
		 //arr[0]=minArr;
			
		 for(int a :arr) {
			 System.out.println(a);
       }	
	}
}

