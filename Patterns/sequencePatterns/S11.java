package sequencePatterns;
// 7654
// 6543
// 5432
// 4321
public class S11 {
public static void main(String[] args) {
		
		int line = 4;
		int star = 4;
		int ch1 = 7;
		for (int i = 0;i<line;i++) {
			int ch2 = ch1;
			for (int j = 0; j<star; j++) {
				System.out.print(ch2);
				ch2--;
			}
			ch1--;
			System.out.println();
		}
	}
}
