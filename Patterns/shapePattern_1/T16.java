package shapePattern_1;
//v
//wv
//xxw
//yyyx
//zzzzy

public class T16 {
	public static void main(String[] args) {
		int line = 5;
		int star = 1;
		char ch = 'v';
		for(int i = 0;i<line;i++) {
			char ch2 = ch;
			for(int j = 0;j<star;j++) {
				System.out.print(ch2);
				if(i-1==j) {
					ch2--;
				}
			}
			ch++;
			star++;
			System.out.println();
		}
	}
}
