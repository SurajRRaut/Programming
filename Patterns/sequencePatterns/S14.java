package sequencePatterns;
// ******
// *1234*
// *1234*
// *1234*
// ******
public class S14 {
public static void main(String[] args) {
		
		int line = 5;
		int star = 6;
		for (int i = 0;i<line;i++) {
			int ch1 = 1;
			for (int j = 0; j<star; j++) {
				
				if(i==0||j==0 || i==4 || j==5) {
					System.out.print("*");
				}
				else {
				 System.out.print(ch1);
				 ch1++;
				}
				
			}
			System.out.println();
		}
	}
}
