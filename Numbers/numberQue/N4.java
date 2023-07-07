package numberQue;
//HOW MANY PRIME NUM BETWEEN 1 - 150
public class N4 {
public static void main(String[] args) {
		int c = 0;
		for(int j = 10;j<=150;j++) {
			int count = 0;
			int a = j; 
			for(int i = 1;i<=a;i++) {
				
				if(a%i==0) {	
					count++;
				}
			}
			if(count==2) {
				c++;
			}
		}
		System.out.println("TOTAL PRIME NO ARE "+c);
	}
}