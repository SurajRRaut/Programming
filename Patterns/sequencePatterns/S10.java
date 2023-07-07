package sequencePatterns;
// 1  2  3  4
// 2  4  6  8
// 3  6  9  12
// 4  8  12  16
public class S10 {
	public static void main(String[] args) {
		
		int line = 4;
		int star = 4;
		int ch1 = 1;
		for (int i = 0;i<line;i++) {
			int ch2 = ch1;
			for (int j = 0; j<star; j++) {
				System.out.print(" " +ch2+ " " );
				ch2 = ch1 + ch2;
			}
			ch1++;
			System.out.println();
		}
	}
}
