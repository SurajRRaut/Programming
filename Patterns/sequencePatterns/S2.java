package sequencePatterns;
// 11111
// 22222
// 33333
// 44444
// 55555
public class S2 {
	public static void main(String[] args) {
		int line = 5;
		int star = 5;
		int ch = 1;
	
		for (int i = 0 ;i<line;i++ ) {
			
			for (int j = 0 ;j<star;j++ ) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();	
		}
	}
}
