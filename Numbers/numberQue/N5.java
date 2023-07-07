package numberQue;
//DISPLAY FIRST 10 PRIME NUMBER
public class N5 {
	public static void main(String[] args) {
		int a = 1;
		int c = 0;
		while(c<10) {
			int count = 0;
			for(int i = 1;i<=a;i++) {	
				if(a%i==0) {	
					count++;
				}
			}
			if(count==2) {
				System.out.println(a);
				c++;
			}
			a++;
		}
	}
}

