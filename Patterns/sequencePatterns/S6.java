package sequencePatterns;
// ABCD
// BCDE
// CDEF
// DEFG
public class S6 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		char ch1 = 'A';
	
		for (int i = 0 ;i<line;i++ ) {
			char ch2 = ch1;
			for (int j = 0 ;j<star;j++ ) {
				System.out.print(ch2);
				ch2++;
			}
			
			System.out.println();
			ch1++;
			
		}
	}
}
