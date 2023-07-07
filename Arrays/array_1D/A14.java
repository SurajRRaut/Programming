package array_1D;
//DISPLAY THE AGE WITH RESPECT TO THEIR NAME'S BY DECENDING ORDER
public class A14 {
	public static void main(String[] args) {
		int[]age = {60,55,65,22,44};
		String [] name = {"A","B","C","D","E"};
		for(int i = 0;i<age.length;i++) {
			for(int j = 0;j<age.length-1-i;j++) { 
				
				 if(age[j]<age[j+1]) {
					 int temp = age[j+1];
					 age[j+1]=age[j];
					 age[j]=temp;
				 }
			}
		}
		System.out.println("NAMES  AGE");
		for(int i = 0;i<age.length;i++) {
			System.out.println(name[i]+"     : "+age[i]);
		}
	}
}
