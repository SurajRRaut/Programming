package sequencePatterns;
// AAA
// ***
// CCC
// ***
// EEE
public class S9 {
	public static void main(String[] args) {
		int line = 5;
		int star = 3;
		char ch = 'A';
		for (int i = 0;i<line;i++) {
			
			for (int j = 0; j<star; j++) {
				
				
				if (i%2 != 0) {
				System.out.print('*');
				}
				else {
					System.out.print(ch);
				}
			}
			ch++;
			System.out.println();
		}
	}
}
