package numberQue;
//CHECK NUMBER PERFECT OR NOT !!
public class N6 {
	public static void main(String[] args) {
		int num = 1;
		int add = 0;
		
		for(int i =1;i<num;i++) {
			if(num%i==0) {
				add+=i;
			}
		}
		if(num == add) {
			System.out.println(num +" : number is the perect number");
		}
		else {
			System.out.println(num +" : number is not perect number");
		}
	}
}
