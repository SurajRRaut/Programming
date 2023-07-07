package numberQue;
//PRINT FIRST 4 PERFECT NUMBER
public class N9 {
	
	public static void main(String[] args) {
		int a = 1;
		int c = 0;
		while(c<4) {
			
			int add = 0;
			for(int i = 1;i<a;i++) {	
				if(a%i==0) {	
					add+=i;
				}
			}
			if(a==add) {
				System.out.println(a);
				c++;
			}
			a++;
		}
	}
}

