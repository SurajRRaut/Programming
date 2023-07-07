package array_1D;
//PRINT PATTERN 
public class A16 {
	public static void main(String[] args) {
		char []arr= {'S','T','A','R'};
		int line = 4;
		int star = 4;
		int a = 0;
		for(int j = 0;j<line;j++) {
			int b = a;
			for(int i = 0;i<star;i++) {
				System.out.print(arr[b]);
				b++;
				if(b>3) {
					b=0;
				}
			}
			a++;
			System.out.println();
		}
	}
}
