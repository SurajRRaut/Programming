package numberQue;
//PRIME NUM BETWEEN 10 - 100
public class N3 {
	public static void main(String[] args) {
		
		for(int j = 10;j<=100;j++) {
			int count =0;
			int a = j; 
			for(int i = 1;i<=a;i++) {
				
				if(a%i==0) {	
					count++;
				}
			}
			if(count==2) {
				System.out.println(a);
			}
		}
	}
}
