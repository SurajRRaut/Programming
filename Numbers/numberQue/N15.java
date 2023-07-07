package numberQue;
//PRINT SPY NUMBER BETWEEN 1 - 100000
public class N15 {
	public static void main(String[] args) {
		int count =0;
		
		for(int i =1;i<=100000;i++) {
			
			int num = i;
			int add = 0;
			int mult = 1;
			
			while(num!=0) {
				int rem = num%10;
				add+=rem;
				mult*=rem;
				num/=10;
			}
			
			if(add==mult) {
				System.out.println(i);
				count ++;
				
			}
		}
		System.out.println("total count : "+count);
	}
}
