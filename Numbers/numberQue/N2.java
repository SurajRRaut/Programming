package numberQue;
//PRIME NUM
public class N2 {
public static void main(String[] args) {
	    int a = 13;
	    int count = 0;
		for(int i = 1;i<=a;i++) {
			
			if(a%i==0) {	
				count++;
			}
		}
		if(count==2) {
			System.out.println("its a prime num");
		}
		else {
			System.out.println("its not a prime num");
		}
	}
}
