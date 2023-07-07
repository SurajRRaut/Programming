package sequencePatterns;
// ABCD
// ABCD
// ABCD
// ABCD
public class S7 {
	public static void main(String[] args) {
		int line = 4;
		int star = 4;
		
		for (int i = 0 ;i<line;i++ ) {
			char ch = 'A';
			for (int j = 0 ;j<star;j++ ) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
